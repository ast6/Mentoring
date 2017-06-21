import org.openqa.selenium.WebDriver;
import webDriver.LogInTest;


public class DemoWebDriver {

    private WebDriver driver;
//static String startingURL = "https://latest.skins.cash/ru";

    public static void main(String[] args) throws Throwable {

        LogInTest logInTest = new LogInTest();

        logInTest.LoggingSteps();


    }
}
