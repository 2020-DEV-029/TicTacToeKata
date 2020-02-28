# Tic Tac Toe Game Kata

This short and simple Kata should be performed using Test Driven Development (TDD).
It is implementation of a simple Tic Tac Toe game.
 ## Rules
  The rules are described below :
  1) X always goes first.
  2) Players cannot play on a played position.
  3) Players alternate placing X’s and O’s on the board until either.
  4) One player has three in a row, horizontally, vertically or diagonally
  5) All nine squares are filled.
  6) If a player is able to draw three X’s or three O’s in a row, that player wins.
  7) If all nine squares are filled and neither player has three in a row, the game is a draw.
  
  ## Getting Started
    In order to run and deploy this application user needs follow below steps -
    1) Clone git repostitory in some local folder using below command run on cmder of bash git command prompt.
       git pull https://github.com/2020-DEV-046/TicTacToeKata.git
    2) Open STS and import project as exiting maven project in STS, Setting up STS steps given in installation section.
    3) Right click imported project and go to maven -> update project.
    4) Right click again imported project and go to Run as -> maven clean to clean project.
    5) Right click again imported project and go to Run as -> maven install to install project to compile source code 
       and generate jar file in target folder.
    6) Copy TicTacToeKata-1.0-RELEASE.jar file generated in target folder to some local folder.
    7) Start dos command prompt and reach to copied jar folder location and run below java command - 
       java -jar TicTacToeKata-1.0-RELEASE.jar
    8) One dialog will open in command prompt to enter player names of both players. Once user enters the asked details, 
       system start with internal toss to assign X state to one of player. Now system will ask every player to enter row 
       and column values to mark corresponding states X or O in score board, system will keep showing board state after 
       both player enters there states. Once winner is identified by system by calculating same state in one row, or one column, 
       or diagonally, it will stop game and show winner's name.
  

 Example command dialog of Tic Tac Toe Game -
  

  ![Example command dialog](https://github.com/2020-DEV-046/TicTacToeKata/blob/master/command_dialog-1.png)
 
  ![Example command dialog](https://github.com/2020-DEV-046/TicTacToeKata/blob/master/command_dialog-2.png)
 
  ## Installing softwares to create dev setup
   In order to create setup for development or generation of jar file, please follow below steps -
  
   ### Installation and setup of JAVA 
    1) Download Java 8 from the Oracle’s Java official website 
        https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html.
    2) Run exe using as administrator
    3) Set environment variables for JAVA_HOME and PATH
    4) Search for Advanced System Settings in the Windows Search box.
    5) Click on Environmental varaibles from popup.
    6) Click on New button under System variables section to create JAVA_HOME with value ex - C:\Program Files\Java\jdk1.8.0_x.
    7) Click on New button under System variables section to create PATH with value ex - %JAVA_HOME%\bin
    8) Check Java and java compiler version using command ex - Java -version, Javac -version, both versions should be Java 8.
    
  ### Installation and setup of MAVEN  
    1) Now Download Maven from official website https://maven.apache.org/download.cgi
    2) Unzip binary folder at certain location in system.
    3) Set environment variables for MAVEN_HOME and PATH.
    4) Now Search for Advanced System Settings in the Windows Search box.
    5) Click on Environmental varaibles from popup.
    6) Click on New button under System variables section to create MAVEN_HOME with value ex - C:\apache-maven-3.6.3.
    7) Click on New button under System variables section to create PATH with value ex - %MAVEN_HOME%\bin
    8) Check maven version using command mvn -version at dos command prompt.
    9) Modify maven repo path in setting.xml, open setting.xml from path location ex - C:\apache-maven-3.x.x\conf\setting.xml
    10) Add line in setting.xml <localRepository>repo path</localRepository> where repo path can be ex- C:\maven\repo
    
  ### Installation and setup of STS  
    1) Go to the STS download site (http://www.springsource.com/products/sts) and download the variant appropriate to the operating              system being used.
    2) Unzip zipped binary folder to root directory ex - C:/.
    3) To verify the installation, run the eclipse.exe executable in the unzipped directory and check that STS displays a welcome panel.           The first time there may be a short delay due to the initial set-up of indexes.
    4) Once STS started, click Window > Preferences from the menu.
    5) In the Preferences window, click Java > Compiler in the left panel.
    6) In the right panel, set the Compiler compliance level to 1.8.
    7) Click Apply.
    8) Now set Maven path in STS, click Window > Preferences from the menu.
    9) In the Preferences window, click Maven > User Settings in the left panel.
    10) In the right panel, Modify User Settings to maven home setting.xml ex- C:\apache-maven-3.x.x\conf\settings.xml.
    11) Local Repository should be modified to localRepository set in setting.xml ex- C:\maven\repo
    12) Click Apply.
    
  ## Deployment
  Follow steps given in section Getting Started.
  
  ## Built With
  * [Maven](https://maven.apache.org/) - Dependency Management
  
  ## Running the tests
  Open TicTacToeKataApplicationTests.java in STS from imported as well as installed project as followed in getting started. Run this       file by clicking right test file and then go to Run As > JUnit Test Case. now all test cases should run and passed as well. Since TDD   approach followed, all test case scenarios were decided in advance.
  
  ## Code Style
  Code design was based on spring boot core module and autowiring used for player classes and CommandLineRunner interface used to         implement to provide user inputs command line dialog for player name and row, column state values to play Tic Tac Toe. TDD approach is   used and test cases were written before writing core logic of game in below fashion.
  
  1) Write test case (fail it locally) for small scenario
  2) Write corresponding function to have logic
  3) Run the test case – make it pass (whether it is positive / negative) locally
  4) Then commit / push the code with proper comments (similar commit format)
  5) Repeat the step1 till step4 again.
  
  ## Versioning
  Used [SemVer](http://semver.org/) for versioning.
  
  ## Authors

  * **2020-DEV-046** - *Initial Assignment work*
  
  ## License
  This project is developed under open source licensing, however modification to this prohibited.
  
