package tests.day3;

import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.BrowserUtils;

public class NavigationPractice {
    public static void main(String[] args) {
        //create a webdriver object, to work with a browser
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize(); //to maximize browser window
        driver.get("http://google.com");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("http://amazon.com");
        //this is our custom method
        //waits for 3 seconds
        //since the method is static, we use class name to call the method
        //as a parameter, we provide number of seconds (time in seconds)
        BrowserUtils.wait(3);

        //to get page title
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.navigate().forward();
        //to refresh a webpage
        driver.navigate().refresh();

        driver.quit();

        //what will happen if i call driver again after we quit
        //you can not call driver after you quit otherwise you will get an Exception:
        //driver.get("http://google.com");
    }
}
