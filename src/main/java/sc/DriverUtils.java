package sc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
}
