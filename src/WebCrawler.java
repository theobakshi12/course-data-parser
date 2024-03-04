import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebCrawler {
    private final String url =
            "https://courses.students.ubc.ca/cs/courseschedule?pname=subjarea&tname=subj-all-departments";

    private JSONArray mainArray;

    public WebCrawler() throws IOException {
        mainArray = new JSONArray();
        crawlMainPage(url);
    }

    private void crawlMainPage(String url) throws IOException {
        Document doc = request(url);
        if(doc != null) {
            Elements allLinks = doc.select("a[href]"); //Select all links on main page

            List<String> departmentLinks = new ArrayList<>();

            for (Element link : allLinks) { //Filtering department page for only course links
                if(link.toString().contains("name=subj-department")) {
                    String s = "https://courses.students.ubc.ca" + link.attr("href");
                    departmentLinks.add(s);
                }
            }

            int count = 1;
            for (String departmentLink : departmentLinks) {
                System.out.println(count + "/242");
                count++;
                crawlCoursePage(departmentLink);
            }

            JSONObject json = new JSONObject();
            json.put("courses", mainArray);

            System.out.println(json);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String formatted = gson.toJson(json);

            FileWriter writer = new FileWriter("course_data.json");
            writer.write(formatted);
            writer.flush();
        }
    }

    private void crawlCoursePage(String url) throws IOException {
        Document doc = request(url);
        if (doc != null) {
            Elements allLinks = doc.select("a[href]"); //Select all links on department page

            List<String> courseLinks = new ArrayList<>();

            for (Element link : allLinks) { //Filtering department page for only course links
                if(link.toString().contains("name=subj-course")) {
                    String s = "https://courses.students.ubc.ca" + link.attr("href");
                    courseLinks.add(s);
                }
            }

            for (String link : courseLinks) { //For each course link, find sections
                Document courseDoc = request(link);
                if (courseDoc != null) {
                    JSONObject course = new JSONObject();
                    String id;
                    if (courseDoc.title().substring(8,9).equals(" ")) {
                        id = courseDoc.title().substring(0,8);
                    } else {
                        id = courseDoc.title().substring(0,9);
                    }

                    course.put("id", id); //adds course id to the top of its json object

                    JSONArray sections = new JSONArray();

                    Elements sectionRows = courseDoc.select("tr");

                    sectionRows.remove(0); //top row of table

                    for (Element row : sectionRows) {
                        Elements tds = row.select("td");

                        if (tds.size() >= 9) {
                            String section = tds.get(1).text();
                            String activity = tds.get(2).text();
                            String term = tds.get(3).text();
                            String modeOfDelivery = tds.get(4).text();
                            String days = tds.get(6).text();
                            String startTime = tds.get(7).text();
                            String endTime = tds.get(8).text();

                            if (!section.isEmpty() && !days.isEmpty() &&
                                    !startTime.isEmpty() && !endTime.isEmpty() &&
                                    !term.isEmpty() && !activity.isEmpty()) {
                                JSONObject sectionData = new JSONObject();

                                String sectionIDcropped = section.substring(section.length()-3);
                                sectionData.put("section", sectionIDcropped);
                                sectionData.put("activity", activity);
                                sectionData.put("term", term);
                                sectionData.put("mode of delivery", modeOfDelivery);
                                sectionData.put("days", days);
                                sectionData.put("start", startTime);
                                sectionData.put("end", endTime);

                                sections.add(sectionData); //adds section to sections array within course
                            }
                        }
                    }

                    course.put("sections", sections); //adds section array to course json, finalizing course json

                    mainArray.add(course); //adds course json to main array;
                }
            }
        }
    }

    private Document request(String url) {
        try {
            Connection con = Jsoup.connect(url);
            Document doc = con.get();

            if (con.response().statusCode() == 200) { //website is accessible
                return doc;
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }
}
