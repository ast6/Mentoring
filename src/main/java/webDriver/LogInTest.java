package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import sc.actions.LogInPageActions;
import sc.pages.LogInPage;

import static sc.DriverUtils.getFoxDriver;

public class LogInTest {

    LogInPageActions logInPageActions = new LogInPageActions();
    private WebDriver driver = getFoxDriver();
    LogInPage logInPage = new LogInPage(driver);

    public void LoggingSteps() throws Throwable {

        driver.get("https://skins.cash");
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        logInPageActions.clickScSignInButton();

        Thread.sleep(20000);

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }

        // Put this to the Action class
        logInPage.getSteamAccountNameButton().sendKeys("shumisteam001");
        logInPage.getSteamAccountPasswordButton().sendKeys("8GLtSBfhYzICQENO");
        logInPage.getSteamSignInButton().click();

        Thread.sleep(70000);
        driver.quit();
    }

}
