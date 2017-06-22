package sc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverUtils {

    private static WebDriver driver;

    public static WebDriver getFoxDriver() {

        if (driver == null) {
            String exePath = "drivers/geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", exePath);
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static WebDriver getOperaDriver() {

        if (driver != new OperaDriver()) {
            String exePath = "drivers/operadriver_win64/operadriver.exe";
            System.setProperty("webdriver.opera.driver", exePath);
            driver = new OperaDriver();
        }
        return driver;
    }

    public static WebDriver getChromeDriver() {

        if (driver != new OperaDriver()) {
            String exePath = "drivers/chromedriver.exe";
            System.setProperty("webdriver.opera.driver", exePath);
            driver = new ChromeDriver();
        }
        return driver;
    }
}
