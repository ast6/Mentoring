package sc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils {

    private static WebDriver driver;

    public static WebDriver getFoxDriver(){

        if(driver == null){
            String exePath = "C:/Users/Fed/IdeaProjects/Mentoring/geckodriver";
            System.setProperty("webdriver.firefox.driver", exePath);
        driver= new FirefoxDriver();
        }
            return driver;

    }

}
