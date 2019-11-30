package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;

public class TestsForLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Autocomplete")).click();
        //<a> it works only if tag name is <a>
        //autocomplete-its the text you see in the link
        //place where it will navigate you specified in the href
        //if you wnat to use linkText or partialLinkText locator strategy
        //element must start with <a>
        //this is how we specify links in HTML
        Thread.sleep(3000);


        driver.quit();
    }
}
