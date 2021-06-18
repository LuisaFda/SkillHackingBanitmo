# ** Banistmo Contingency Channel** 

## Introduction 🚀
This is a challenge for Banistmo

## Pre requirements 📋
- Java version 1.8, update 151 or higher and JDK (environment variables configured).
- Eclipse IDE or IntelliJ IDEA (version 2018.3 or higher).
- Gradle version 5.1.1 or higher (environment variables configured).
- Cucumber for Java Plugin (updated version).
- Gherkin Plugin (updated version).
- ChromeDriver version 90.0.4430.212 for local runs of automations.
- ChromeDriver version 90.0.4430.212 for the execution of the RM Pipeline (the VDI web browser where the Pipeline is executed has the equivalent version).

## Installation 🔧
- To clone this repository locally, the following command must be run: 
```https://github.com/LuisaFda/SkillHackingBanistmo.git``` 
- Import the project from Eclipse or IntelliJ IDE under the structure of an existing Gradle project. 
- Configure JRE System Library with JavaSE-1.8.
- Configure the encoding to UTF-8 to the project once it is imported.

## Compile the project and generate Wrapper 🔨
- To build the project you must run the command:
```gradle clean build -x test```
- To generate the project wrapper files, you must run the command:
```gradle wrapper --gradle-distribution-url https://services.gradle.org/distributions/gradle-6.7-bin.zip```

## Web browsers 🌐
Automation currently runs in the following browser:
- Google Chrome version 90 or higher.

## Project structure 🚧
* ```src/main/java/co/com/banistmo/certification/training```
``` 
+ exceptions
    Classes that catch exceptions and throw custom messages when automation fails due to it is not found what was expected.

+ interactions
    Classes that perform low-level actions, such as change tab in browser, reload browser, among others.

+ models
    Classes with which the data models are built using the builder pattern.

+ questions
    Classes with which values are obtained and then verified in the StepDefinitions (asserts).

+ tasks
    Classes that perform high-level actions, such as login in the application, enter data into a form, etc.

+ userinterfaces
    Classes where the elements of the user interface are mapped throw Xpaths.

+ utils
    Classes that contain common functionalities.
```

* ```src/test/java/co/com/banistmo/certification/training```
```
+ runners
    Classes to run the automations with the scenarios indicated in the equivalents Features.

+ stepdefinitions
    Classes that allow the translation of the Gherkin language used in the Features into machine language, thus they make possible the execution of automation.
    There is a general Step Definitions class that contains the configuration and steps that are repeated in the other Step Definitions, therefore the General inherits to the others.
 ```

 * ```src/test/resources```
```
+ features
    The project features are found.

+ formatteddocuments
    Excel file used in some tests that require attaching documents.
```

## Built with 🛠
Automation was developed with:
 - BDD - Development strategy
 - Screenplay pattern - Design pattern that applies SOLID principles
 - Gradle - Dependency manager
 - Selenium Web Driver - Tool to automate actions in web browsers
 - Cucumber - Framework to automate BDD tests
 - Serenity BDD - Framework, Open source library for report generation
 - Gherkin - Business-readable domain specific language (DSL)

## Versioning 📌 
Git was used for version control, applying the Trunk Based Development methodology 

## Command for execution ▶️
The project can be executed from the console with the following command:
```gradle clean test aggregate```

## CD Pipeline 🔗
The project has an associated Continuous Deployment Pipeline. 
Pipeline name: 

## RM Pipeline ⏩
The project has an associated Release Management Pipeline running on VDIBDPQCD063 VDI. 
Pipeline name: 

## Autores ✒
* **Luisa Fernanda Tangarife Restrepo** - [luisa.tangarife@banistmo.com](#luisa.tangarife)
