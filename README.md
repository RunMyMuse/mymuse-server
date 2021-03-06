# MyMuse Server
The purpose of this project is to serve as the backend server for the mymuse
server. The MyMuse Server will be responsible for providing an api for frontend
agents, security, and will be in charge persisting data through the provided
api.

## Development

This section contains information relevant to people looking to setup and contribute
to the mymuse server.

### Setup

This section contains information on setting up and running the project locally

- To set up the project, follow the [local setup guide](LOCAL_SETUP.md)
- To run the porject locally follow the [local execution guide](LOCAL_RUN.md)

### Quality Assurance

This section details information on contributing quality code to the repo

- All code must adhere to the [style guide](https://github.com/theMyMuse/mymuse_central/blob/master/STYLE.md)
- All code should be unit tested whenever possible. The goal is to have 70% code coverage repo wide. Test examples can be found in the [style guide](https://github.com/theMyMuse/mymuse_central/blob/master/STYLE.md)
- All code must be submitted to code review by making a PR to the [mymuse_server repo](https://github.com:theMyMuse/mymuse_server.git)
- All code must be pass quality assurance passes in order to be merged

## License

You can view the [liscense](LICENSE)

### Building the project

`./gradlew assemble`

### Running checks

`./gradlew check`

### Running unit tests

`./gradlew test`

### Running integration tests

`./gradlew integrationTest`

### Docker image
#### Building a docker image

`./gradlew dockerize`

#### Running the docker image

`docker run -p 8080:8080 -t <docker image>`
