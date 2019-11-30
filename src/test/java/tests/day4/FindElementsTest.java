package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;
import utilities.BrowserUtils;

public class FindElementsTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        BrowserUtils.wait(2);
        //once we open the page we have to capture a title
        String expectedTitle = driver.getTitle();

        //step 1 open inspector in chrome and find locator for the element
        //step 2 create object of WebElement
        //Step 3 use web element

        WebElement button = driver.findElement(By.id("form_submit"));
        //to click on the element
        button.click();
        //read title again after clicking
        String actualTitle = driver.getTitle();
        //in this way, we are making sure that after clicking
        //we stay on the same page.
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test passed");
            System.out.println("actual title is: "+actualTitle);
        }else{
            System.out.println("Test failed");
            System.out.println("Expected title is:" +expectedTitle);
            System.out.println("Actual title: "+actualTitle);
        }
        //wait for 2 seconds
        BrowserUtils.wait(2);
        driver.quit();
    }
}
