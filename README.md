# learning-platform
Web application for learning the basics of OOP with Spring.
#### Prerequisites: [Java 11](https://www.oracle.com/cis/java/technologies/javase/jdk11-archive-downloads.html), [Maven](https://maven.apache.org/), [PostgreSQL](https://www.postgresql.org/).

## Getting Started
#### 1. Clone the application
    git clone https://github.com/floMaxter/learning-platform
    cd learning-platform
#### 2. Change PostgreSQL username and password
* Open ```src/main/resources/application.properties```.
* Change ```spring.datasource.username``` and ```spring.datasource.password as per your PostgreSQL installation```.

Or set your PostgreSQL root password to "root" according application.properties.

#### 3. Create a database
    createdb security_app_db
#### 4. Run the server using Maven
    mvn spring-boot:run
#### 5. Open the start page
Go to ```localhost:8080/logo```.
