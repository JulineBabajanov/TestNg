package tests.day2;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        driver.navigate().to("http://target.com");
        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.close();

    }
}
