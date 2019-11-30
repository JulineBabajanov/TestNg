package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.BrowserUtils;

public class TestForNameLocator {
    public static void main(String[] args) {
        // remember for mac users! you don't need to set up webdriverManager for safari
        //safari is already built in... it has embedded webdriver support
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        // if you want to do in one line without creating webelement reference variable
        //enter full name
        driver.findElement(By.name("full_name")).sendKeys("Test User");
        //enter email
        driver.findElement(By.name("email")).sendKeys("random@yahoo.com");
       // click sign up
        BrowserUtils.wait(3);
        driver.findElement(By.name("wooden_spoon")).submit();


        driver.quit();
    }
}
