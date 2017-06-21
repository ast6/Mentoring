package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDrivers {

    public void settings(String startingURL) {
        WebDriver driver = new ChromeDriver();

        driver.quit();
    }

}
