package tests.Online19;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrackLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        WebElement UserNameLocator=driver.findElement(By.name("_username"));
        WebElement PassWordLocator=driver.findElement(By.name("_password"));
        String Vy_Main_Username="storemanager222";
        String Vy_Main_Password="UserUser123";
        UserNameLocator.sendKeys(Vy_Main_Username);
        PassWordLocator.sendKeys(Vy_Main_Password);
        driver.findElement(By.name("_submit")).click();
        String webUrl=driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println(webUrl);
        System.out.println(title);
        Thread.sleep(8000);
        driver.close();




    }
}
