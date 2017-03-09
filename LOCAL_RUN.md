## Running the Project

### Build the source code

There are several ways to compile and check the code:

- Run the checks `$ ./gradlew check`
- Run the unit tests `$ ./gradlew test`
- Run the integration tests `$ ./gradlew test`
- Assemble the jar `$ ./gradlew assemble`
- Run all checks and build the jar `$ ./gradlew assemble`
- Dockerize the project `$ ./gradlew dockerize`


### Run the code

There are three ways to run the project. After building the project:
 
1. `$ java -jar server/build/libs/mymuse_server.jar` probably the most straight forward
2. `$ gradlew bootRun` for gradlew fanatics
3. Configure your ide to run the code using `Boot.java`