package tests.day4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;
import utilities.BrowserUtils;

public class EnterTextPractice {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
         driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement inputBox = driver.findElement(By.name("email"));
        //enter the text into the input box
        inputBox.sendKeys("random@yahoo.com");

        WebElement button = driver.findElement(By.id("form_submit"));
        button.click();
        BrowserUtils.wait(2);
        String expectedUrl = "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();
                if(expectedUrl.equals(actualUrl)){
                    System.out.println("Test passed");
                }else{
                    System.out.println("Test failed");
                }

        //BrowserUtils.wait(3);
        driver.close();

    }
}
