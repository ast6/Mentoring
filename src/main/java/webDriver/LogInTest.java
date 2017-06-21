package webDriver;

import org.openqa.selenium.WebDriver;
import sc.DriverUtils;
import sc.actions.LogInPageActions;
import sc.pages.LogInPage;

public class LogInTest {

    private WebDriver driver = DriverUtils.getFoxDriver();
    private LogInPageActions logInPageActions = new LogInPageActions();
    private LogInPage logInPage = new LogInPage();

    public void LoggingSteps() throws Throwable {

        driver.get("https://skins.cash");

        logInPageActions.clickScSignInButton();

        Thread.sleep(20000);

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }

        logInPage.getSteamAccountNameButton().sendKeys("shumisteam001");
        logInPage.getSteamAccountPasswordButton().sendKeys("8GLtSBfhYzICQENO");
        logInPage.getSteamSignInButton().click();

        Thread.sleep(70000);
        driver.quit();
    }

}
