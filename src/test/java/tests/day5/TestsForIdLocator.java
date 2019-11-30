package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;
import utilities.BrowserUtils;

public class TestsForIdLocator {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
       //id = "disappearing_button"
        WebElement button = driver.findElement(By.id("disappearing_button"));
        button.click();
        WebElement result = driver.findElement(By.id("result"));
        //<p id="result" style="color:green">Now it's gone!</p>
        //Now it's gone! <---- text, .getText() will return this text
        System.out.println(result.getText());
        BrowserUtils.wait(3);

        driver.quit();
    }
}
