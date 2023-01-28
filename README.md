## skeleton-service

------------------------------------------------------------------------------------------------

### Tools/Version

```sh

Java Version : 17 
Gradle Version : 7.4.2

````

------------------------------------------------------------------------------------------------

### Setup

#### Setup configurations.

```sh

1. Provide artifactory userName & password in gradle.properties.

```

------------------------------------------------------------------------------------------------

### Starting up the service:

```sh

1. Do "gradle bootrun" or execute "run.bat" file.
2. If using Docker, Do
    2.1 Do "gradle bootjar or gradle build" to build jar file. 
    2.2 Execute run/local-build.sh to build docker image.
    2.3 Execute run/local-run.sh to run latest docker image.
3. To run in Intellij, Run/Debug main method in Application.java class.

```

------------------------------------------------------------------------------------------------

### Sample APIs to test.

```sh

Use postman collection inside tools/postman folder.

```

------------------------------------------------------------------------------------------------

### How to use this skeleton for some other service

```sh

1. Copy the code from this repo into a new repo using below link
   https://docs.github.com/en/repositories/creating-and-managing-repositories/duplicating-a-repository

2. If any feature is not needed, remove corresponding dependencies from build.gradle
    2.1 To remove Kafka : remove kafka dependencies.
    2.2 To remove db : remove all jdbc, hikari dependencies.

4. Remove unwanted files from the src/main packages:
    4.1 Remove java files which are not needed from src/main/java & test files from src/test/groovy 
    4.2 Remove classes from jacoco coverage settings in build.gradle
    4.3 Keep Application.java class as is.
    4.4 Update/Remove postman collection from tools/ folder.

5. Update project name wherever applicable from skeleton-service to new project name. 
   Just search for skeleton-service in all the files and replace it with new project name.

6. Update scripts file inside run/ folder to use new project name & version wherever needed. 
   version is declared in gradle.properties file.

```