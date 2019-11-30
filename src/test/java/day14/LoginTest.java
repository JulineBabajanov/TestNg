package day14;

import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.sql.SQLOutput;

public class LoginTest {


        @Test
        public void test1 () {
            //read url value from the properties file
            String url = ConfigurationReader.getProperty("url");
            //Driver.get()-->will return webdriver object
            //and then we can call webdriver methods like get(), findElement()....
            //Webdriver driver = driver.get()
            Driver.get().get("url");
            //print page titiel
            System.out.println(Driver.get().getTitle());
            BrowserUtils.wait(2);
            Driver.close();
        }
    }

