package day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

public class ConfigReaderTest {


       @Test
       public void test1(){
           String expectedBrowser = "chrome";
           //we write keys in "key" as a String
           //as return you wil get value
           //key=value
           //property name = value
           //we dont change in the one place and effect entire framework
           //every class will read browser type

           String actualBrowser = ConfigurationReader.getProperty("browser");
           Assert.assertEquals(actualBrowser,expectedBrowser);
           System.out.println(ConfigurationReader.getProperty("url"));
           System.out.println(ConfigurationReader.getProperty("user_name"));
           System.out.println(ConfigurationReader.getProperty("password"));
       }
   }



