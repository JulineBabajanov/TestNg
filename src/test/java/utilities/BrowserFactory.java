package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browser) {
        //finding your operating system name
        // String osName = System.getProperty("os.name");e
        //WebDriver driver = new SafariDriver();

        {
            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }  else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.chromedriver().setup();
                return new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("safari")) {
                return new SafariDriver();
            }
            return null;
        }
    }
}
