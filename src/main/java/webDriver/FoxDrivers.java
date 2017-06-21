package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FoxDrivers {

    public void settings(String startingURL) {
        String exePath = "C:/Users/Fed/IdeaProjects/Mentoring/geckodriver";
        System.setProperty("webdriver.chrome.driver", exePath);

        WebDriver driver = new FirefoxDriver();

    }
}
