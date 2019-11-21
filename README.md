# CalculatorRest
Java WS calculator using Rest api


I used IntelliJ IDEA which has maven and graddle already
however if you do not have Maven or Graddle then you'll need Maven3.2+ and Graddle4+
Alternatively you can run it through command line. I'll put a guide futher down on how to do that.


//IMPORTING PROJECT
When importing the project with IntelliJ go to Import Project and click build.gradle file
The project should then be to run. You can run the UnitTest to test the logic or just run the application and test it out yourself.

//DEFAULT LINK
Default link to the calculator is http://localhost:5000/calculator/add?operands=
You should be able to just click the links from the pdf that you linked. 

If you'd like to change the default port then go navigate to:
src/main/resources/application.properties
Here you can change the server port to whatever

//RUNNING THE PROJECT IN COMMANDLINE
Follow these two guides to make sure that you're set up right. 
https://www.mkyong.com/maven/how-to-install-maven-in-windows/
https://www.mkyong.com/java/how-to-set-java_home-on-windows-10/

After these two are installed and set up, then open command line navigate to the root directory of CalculatorRest
and just type mvn spring-boot:run
This should serve the rest api and allow you to access it through http://localhost:5000/calculator/add?operands=

//UnitTest
the unit test in this project is quite small and I ran through IntelliJ using JUnit plugin.
Just change the run config to the CoreUnitTest and run it. The JUnit java file is part of the project, 
so you can always import it and use it in whatever IDE you want. 
