# housecallpro-selenium
Test project with a test example for Housecall Pro site  <br>
This project is a Maven/Java project presenting a Page Object Model of the Housecall Pro. <br>
In order to do that, the site has been broken down into **pages** and **components** to expose all the business logic to the test layer.<br>

## Technologies
Project is created with:

- Java 17
- Apache Maven
- Selenide
- testNG
- Log4j

## Setup
- To build project
 ```
 mvn clean install -DskipTests
 ```
- To run test
 ```
 mvn test
 ```

## Additional information
- The screenshot and page source for the failed test are saved in the directory: <br>
  ```housecallpro-selenium/build/reports/tests```


- Additional logs can be added using the log4j library
```
import org.apache.log4j.Logger;

public class HouseCallProLoginPage {

    private final static Logger LOGGER = Logger.getLogger(HouseCallProLoginPage.class);

    public HouseCallProLoginPage open() {
        LOGGER.info("Open Login Page");
        Selenide.open(PropertiesManager.getHousecallproUrl() + "/pro/log_in");
        $(LOGIN_PAGE_CONTAINER).shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }
 ```

- The variables used in the project are stored in the `config.properties` file
