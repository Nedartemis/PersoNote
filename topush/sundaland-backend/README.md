# sundaland-backend

This is the backend for the Sundaland application. It uses Quarkus and is
written in Java.

## Requirements

- Java 17
- MongoDB

## Development

You should use the given Docker Compose to run the dependencies of the app.

```shell script
cd docker
docker compose up
```

You can run your application in dev mode that enables live coding using:
```shell script
mvn compile quarkus:dev
```

## Packaging and running the application

The application can be packaged using:
```shell script
mvn package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
mvn package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Configuration

For a deployment in production, you must configure the following environment
variables.

| Variable                   | Description           |
|----------------------------|-----------------------|
| SUNDALAND_MONGODB_USER     | MongoDB user username |
| SUNDALAND_MONGODB_PASSWORD | MongoDB user password |
| SUNDALAND_MONGODB_HOST     | MongoDB server host   |
| SUNDALAND_MONGODB_DATABASE | MongoDB database name |
| SUNDALAND_ADMIN_TOKEN      | Sundaland admin token |
