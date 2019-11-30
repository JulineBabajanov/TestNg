package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;
import utilities.BrowserUtils;

public class TestsForClassNameLocator {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
         //<h3 class="h3">Multiple buttons</h3>
        //h3 - its a class name, or a value of class attribute
        //if class has a text with a space, that means its two different class names
        WebElement heading = driver.findElement(By.className("h3"));
        //we can read the text of attribute
        BrowserUtils.wait(3);
        System.out.println(heading.getText());
        //class name stands for goruping elements. buttons for the same types. developers apply class names in groups
        //hyperlinks get styled in groups also



        driver.close();
    }
}
