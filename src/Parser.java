public class Parser {

    private String htmlInput;
    private String testInput;

    public Parser(){
        testInput = "CPSC 100\tComputational Thinking\n" +
                "CPSC 103\tIntroduction to Systematic Program Design\n" +
                "CPSC 107\tSystematic Program Design\n" +
                "CPSC 110\tComputation, Programs, and Programming\n" +
                "CPSC 121\tModels of Computation\n" +
                "CPSC 203\tProgramming, Problem Solving, and Algorithms\n" +
                "CPSC 210\tSoftware Construction\n" +
                "CPSC 213\tIntroduction to Computer Systems\n" +
                "CPSC 221\tBasic Algorithms and Data Structures\n" +
                "CPSC 259\tData Structures and Algorithms for Electrical Engineers\n" +
                "CPSC 298\tCo-operative Work Placement I\n" +
                "CPSC 302\tNumerical Computation for Algebraic Problems\n" +
                "CPSC 303\tNumerical Approximation and Discretization\n" +
                "CPSC 304\tIntroduction to Relational Databases\n" +
                "CPSC 310\tIntroduction to Software Engineering\n" +
                "CPSC 311\tDefinition of Programming Languages\n" +
                "CPSC 312\tFunctional and Logic Programming\n" +
                "CPSC 313\tComputer Hardware and Operating Systems\n" +
                "CPSC 314\tComputer Graphics\n" +
                "CPSC 317\tIntroduction to Computer Networking\n" +
                "CPSC 319\tSoftware Engineering Project\n" +
                "CPSC 320\tIntermediate Algorithm Design and Analysis\n" +
                "CPSC 322\tIntroduction to Artificial Intelligence\n" +
                "CPSC 330\tApplied Machine Learning\n" +
                "CPSC 340\tMachine Learning and Data Mining\n" +
                "CPSC 344\tIntroduction to Human Computer Interaction Methods\n" +
                "CPSC 349\tHonours Research Seminar\n" +
                "CPSC 368\tDatabases in Data Science\n" +
                "CPSC 404\tAdvanced Relational Databases\n" +
                "CPSC 406\tComputational Optimization\n" +
                "CPSC 410\tAdvanced Software Engineering\n" +
                "CPSC 416\tDistributed Systems\n" +
                "CPSC 418\tParallel Computation\n" +
                "CPSC 420\tAdvanced Algorithms Design and Analysis\n" +
                "CPSC 421\tIntroduction to Theory of Computing\n" +
                "CPSC 422\tIntelligent Systems\n" +
                "CPSC 425\tComputer Vision\n" +
                "CPSC 427\tVideo Game Programming\n" +
                "CPSC 430\tComputers and Society\n" +
                "CPSC 436A\tTopics in Computer Science - OS DESIGN & IMPL\n" +
                "CPSC 436C\tTopics in Computer Science - CLOUD COMPUTING\n" +
                "CPSC 436E\tTopics in Computer Science - ENTREPRENEURSHIP\n" +
                "CPSC 436N\tTopics in Computer Science - NLP\n" +
                "CPSC 436R\tTopics in Computer Science - RANDOMIZED ALGS\n" +
                "CPSC 436S\tTopics in Computer Science - COMP SECURITY\n" +
                "CPSC 440\tAdvanced Machine Learning\n" +
                "CPSC 444\tAdvanced Methods for Human Computer Interaction\n" +
                "CPSC 447\tIntroduction to Visualization\n" +
                "CPSC 448A\tDirected Studies in Computer Science - DIRECTED STUDIES\n" +
                "CPSC 448B\tDirected Studies in Computer Science - DIRECTED STUDIES\n" +
                "CPSC 448C\tDirected Studies in Computer Science - DIRECTED STUDIES\n" +
                "CPSC 449\tHonours Thesis\n" +
                "CPSC 491\tInteractive Digital Media Practicum\n" +
                "CPSC 501\tTheory of Automata, Formal Languages and Computability\n" +
                "CPSC 504\tData Management\n" +
                "CPSC 508\tOperating Systems\n" +
                "CPSC 509\tProgramming Language Principles\n" +
                "CPSC 521\tParallel Algorithms and Architectures\n" +
                "CPSC 522\tArtificial Intelligence II\n" +
                "CPSC 524\tComputer Graphics: Modelling\n" +
                "CPSC 532C\tTopics in Artificial Intelligence - HUMAN-CENTRED AI\n" +
                "CPSC 532D\tTopics in Artificial Intelligence - STAT LEARN THRY\n" +
                "CPSC 532V\tTopics in Artificial Intelligence - NLP COMMONSENSE\n" +
                "CPSC 532Y\tTopics in Artificial Intelligence - CAUSAL ML\n" +
                "CPSC 533V\tTopics in Computer Graphics - LEARNING TO MOVE\n" +
                "CPSC 533Y\tTopics in Computer Graphics - DEEP VIS. GEOM.\n" +
                "CPSC 536E\tTopics in Algorithms and Complexity - GRAPH DRAWING\n" +
                "CPSC 536M\tTopics in Algorithms and Complexity - OPTIM THEORY\n" +
                "CPSC 536S\tTopics in Algorithms and Complexity - SUBMODULAR OPT\n" +
                "CPSC 536W\tTopics in Algorithms and Complexity - QUANTUM COMP\n" +
                "CPSC 538G\tTopics in Computer Systems - REAL-TIME COMP.\n" +
                "CPSC 538L\tTopics in Computer Systems - CAUSAL ML\n" +
                "CPSC 538S\tTopics in Computer Systems - ACCOUNTABLE SYS\n" +
                "CPSC 539B\tTopics in Programming Languages - DEPENDENT TYPES\n" +
                "CPSC 539S\tTopics in Programming Languages - PROGRAMVERIFIERS\n" +
                "CPSC 540\tMachine Learning\n" +
                "CPSC 543\tPhysical User Interface Design and Evaluation\n" +
                "CPSC 544\tHuman Computer Interaction\n" +
                "CPSC 545\tAlgorithms for Bioinformatics\n" +
                "CPSC 549A\tMaster's Thesis - MASTERS THESIS\n" +
                "CPSC 549B\tMaster's Thesis - MASTERS THESIS\n" +
                "CPSC 550\tMachine Learning II\n" +
                "CPSC 554C\tTopics in Human-Computer Interaction - HUMAN-CENTRED AI\n" +
                "CPSC 554X\tTopics in Human-Computer Interaction - ML & SIGNALS\n" +
                "CPSC 589\tM.Sc. Major Essay\n" +
                "CPSC 649\tDoctoral Dissertation";
        htmlInput = "<tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=100\">CPSC 100</a></td><td>Computational Thinking</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=103\">CPSC 103</a></td><td>Introduction to Systematic Program Design</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=107\">CPSC 107</a></td><td>Systematic Program Design</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=110\">CPSC 110</a></td><td>Computation, Programs, and Programming</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=121\">CPSC 121</a></td><td>Models of Computation</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=203\">CPSC 203</a></td><td>Programming, Problem Solving, and Algorithms</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=210\">CPSC 210</a></td><td>Software Construction</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=213\">CPSC 213</a></td><td>Introduction to Computer Systems</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=221\">CPSC 221</a></td><td>Basic Algorithms and Data Structures</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=259\">CPSC 259</a></td><td>Data Structures and Algorithms for Electrical Engineers</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=298\">CPSC 298</a></td><td>Co-operative Work Placement I</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=302\">CPSC 302</a></td><td>Numerical Computation for Algebraic Problems</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=303\">CPSC 303</a></td><td>Numerical Approximation and Discretization</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=304\">CPSC 304</a></td><td>Introduction to Relational Databases</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=310\">CPSC 310</a></td><td>Introduction to Software Engineering</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=311\">CPSC 311</a></td><td>Definition of Programming Languages</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=312\">CPSC 312</a></td><td>Functional and Logic Programming</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=313\">CPSC 313</a></td><td>Computer Hardware and Operating Systems</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=314\">CPSC 314</a></td><td>Computer Graphics</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=317\">CPSC 317</a></td><td>Introduction to Computer Networking</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=319\">CPSC 319</a></td><td>Software Engineering Project</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=320\">CPSC 320</a></td><td>Intermediate Algorithm Design and Analysis</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=322\">CPSC 322</a></td><td>Introduction to Artificial Intelligence</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=330\">CPSC 330</a></td><td>Applied Machine Learning</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=340\">CPSC 340</a></td><td>Machine Learning and Data Mining</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=344\">CPSC 344</a></td><td>Introduction to Human Computer Interaction Methods</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=349\">CPSC 349</a></td><td>Honours Research Seminar</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=368\">CPSC 368</a></td><td>Databases in Data Science</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=404\">CPSC 404</a></td><td>Advanced Relational Databases</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=406\">CPSC 406</a></td><td>Computational Optimization</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=410\">CPSC 410</a></td><td>Advanced Software Engineering</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=416\">CPSC 416</a></td><td>Distributed Systems</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=418\">CPSC 418</a></td><td>Parallel Computation</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=420\">CPSC 420</a></td><td>Advanced Algorithms Design and Analysis</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=421\">CPSC 421</a></td><td>Introduction to Theory of Computing</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=422\">CPSC 422</a></td><td>Intelligent Systems</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=425\">CPSC 425</a></td><td>Computer Vision</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=427\">CPSC 427</a></td><td>Video Game Programming</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=430\">CPSC 430</a></td><td>Computers and Society</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=436A\">CPSC 436A</a></td><td>Topics in Computer Science - OS DESIGN &amp; IMPL</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=436C\">CPSC 436C</a></td><td>Topics in Computer Science - CLOUD COMPUTING</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=436E\">CPSC 436E</a></td><td>Topics in Computer Science - ENTREPRENEURSHIP</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=436N\">CPSC 436N</a></td><td>Topics in Computer Science - NLP</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=436R\">CPSC 436R</a></td><td>Topics in Computer Science - RANDOMIZED ALGS</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=436S\">CPSC 436S</a></td><td>Topics in Computer Science - COMP SECURITY</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=440\">CPSC 440</a></td><td>Advanced Machine Learning</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=444\">CPSC 444</a></td><td>Advanced Methods for Human Computer Interaction</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=447\">CPSC 447</a></td><td>Introduction to Visualization</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=448A\">CPSC 448A</a></td><td>Directed Studies in Computer Science - DIRECTED STUDIES</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=448B\">CPSC 448B</a></td><td>Directed Studies in Computer Science - DIRECTED STUDIES</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=448C\">CPSC 448C</a></td><td>Directed Studies in Computer Science - DIRECTED STUDIES</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=449\">CPSC 449</a></td><td>Honours Thesis</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=491\">CPSC 491</a></td><td>Interactive Digital Media Practicum</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=501\">CPSC 501</a></td><td>Theory of Automata, Formal Languages and Computability</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=504\">CPSC 504</a></td><td>Data Management</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=508\">CPSC 508</a></td><td>Operating Systems</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=509\">CPSC 509</a></td><td>Programming Language Principles</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=521\">CPSC 521</a></td><td>Parallel Algorithms and Architectures</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=522\">CPSC 522</a></td><td>Artificial Intelligence II</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=524\">CPSC 524</a></td><td>Computer Graphics: Modelling</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=532C\">CPSC 532C</a></td><td>Topics in Artificial Intelligence - HUMAN-CENTRED AI</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=532D\">CPSC 532D</a></td><td>Topics in Artificial Intelligence - STAT LEARN THRY</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=532V\">CPSC 532V</a></td><td>Topics in Artificial Intelligence - NLP COMMONSENSE</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=532Y\">CPSC 532Y</a></td><td>Topics in Artificial Intelligence - CAUSAL ML</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=533V\">CPSC 533V</a></td><td>Topics in Computer Graphics - LEARNING TO MOVE</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=533Y\">CPSC 533Y</a></td><td>Topics in Computer Graphics - DEEP VIS. GEOM.</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=536E\">CPSC 536E</a></td><td>Topics in Algorithms and Complexity - GRAPH DRAWING</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=536M\">CPSC 536M</a></td><td>Topics in Algorithms and Complexity - OPTIM THEORY</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=536S\">CPSC 536S</a></td><td>Topics in Algorithms and Complexity - SUBMODULAR OPT</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=536W\">CPSC 536W</a></td><td>Topics in Algorithms and Complexity - QUANTUM COMP</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=538G\">CPSC 538G</a></td><td>Topics in Computer Systems - REAL-TIME COMP.</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=538L\">CPSC 538L</a></td><td>Topics in Computer Systems - CAUSAL ML</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=538S\">CPSC 538S</a></td><td>Topics in Computer Systems - ACCOUNTABLE SYS</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=539B\">CPSC 539B</a></td><td>Topics in Programming Languages - DEPENDENT TYPES</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=539S\">CPSC 539S</a></td><td>Topics in Programming Languages - PROGRAMVERIFIERS</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=540\">CPSC 540</a></td><td>Machine Learning</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=543\">CPSC 543</a></td><td>Physical User Interface Design and Evaluation</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=544\">CPSC 544</a></td><td>Human Computer Interaction</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=545\">CPSC 545</a></td><td>Algorithms for Bioinformatics</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=549A\">CPSC 549A</a></td><td>Master's Thesis - MASTERS THESIS</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=549B\">CPSC 549B</a></td><td>Master's Thesis - MASTERS THESIS</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=550\">CPSC 550</a></td><td>Machine Learning II</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=554C\">CPSC 554C</a></td><td>Topics in Human-Computer Interaction - HUMAN-CENTRED AI</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=554X\">CPSC 554X</a></td><td>Topics in Human-Computer Interaction - ML &amp; SIGNALS</td></tr><tr class=\"section1\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=589\">CPSC 589</a></td><td>M.Sc. Major Essay</td></tr><tr class=\"section2\"><td><a href=\"/cs/courseschedule?pname=subjarea&amp;tname=subj-course&amp;dept=CPSC&amp;course=649\">CPSC 649</a></td><td>Doctoral Dissertation</td></tr>\n";
        parse(testInput);
    }

    public void htmlParse(String input) {
        int index = 0;
        String result = "";
        while(index < input.length()) {
            if (input.substring(index,index+1).equals("<")) {

            }
            index++;
        }
    }

    public void parse(String input) {
        int index = 0;
        String result = "";
        while(index < input.length()) {
            if (Character.isDigit(input.charAt(index))) {
                result += "{\n" +
                        "      \"id\": \"" + input.substring(index-5,index+4) + "\"\n" +
                        "    }";
                index += 4;
            }
            index++;
        }
        System.out.println(result);
    }

}
