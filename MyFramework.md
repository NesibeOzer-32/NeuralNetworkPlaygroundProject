My Framework

My Framework is Behavior Driven Development(BDD)Cucumber Framework. 
I used JAVA as my programming Language.
I used MAVEN as my built automation  tool which has pom.xml file that contains info about my project.


Resources directory - Features Package

I write my test cases as if they are scenario from the end users perspective in Gherkin language in my feature file under the features package. With Gherkin language reading an understanging my framework is easy for non_technical teammates.
My feature file contains Scenario and it consist of test steps. Every test step has code implementation-step definitions method, that turns the phrase into an action. 


Step definition Package

I implemented the actual coding logic inside of my Step definition Package
I created CukesRunner class under thne StepDefinitions Package. I run my codes with tags in CukesRunner class. 


Page Object Model (POM)

I created NeuralNetworkPlaygroundPage. I located web elements and put related methods in each page.


Utilities

I have  driver utilities, browser utilities, and configuration reader under the utilities. Utilities used to store reusable code. 
In driver utilities I set up the Web Driver. BrowserUtils contains general methods for my automation and I have sleep method in it for this project. configuration reader reads configuration.properties files.
