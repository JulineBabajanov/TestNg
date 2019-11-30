package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {
    private static WebDriver driver;
    //you can not do like this, if constructor is private Driver obj = new Driver()
    private Driver(){
        //if switch statement complains on string parameter
        //change java version to 7+
    }
    public static WebDriver get(){
        //if webdriver object was not created yet
        if(driver==null){
            //create webdriver object based on browser value from properties file
            String browser = ConfigurationReader.getProperty("browser");
            switch(browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    //if browser type is wrong, stop tests and throw exception
                    //no browser will be opened
                    throw new RuntimeException("Wrong browser type!");
            }
        }
        //
        return driver;
    }
    public static void close(){
        //if driver still exists, close all browsers
        if(driver!=null){
            driver.quit();
            //destroy driver object, ready for garbage collector
            driver=null;
        }
    }
}
