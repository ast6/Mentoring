package sc.Steps;

import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.Given;
import org.openqa.selenium.WebDriver;

import sc.actions.LogInPageActions;
import sc.pages.LoginPage;

import static sc.DriverUtils.getFoxDriver;

public class LogInTestSteps{

    private LogInPageActions logInPageActions = new LogInPageActions();
    private WebDriver driver = getFoxDriver();
    private LoginPage loginPage = new LoginPage(driver);

    @Given("a stock of <name> and a <password>")
    public void loggingSteps() throws Throwable{
        driver.get("https://skins.cash");
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        String winHandleBefore = driver.getWindowHandle();

        logInPageActions.clickScSignInButton();

        Thread.sleep(20000);

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }

        // Put this to the Action class
        loginPage.getSteamAccountNameField().sendKeys("shumisteam001");
        loginPage.getSteamAccountPasswordField().sendKeys("8GLtSBfhYzICQENO");
        loginPage.getSteamSignInButton().click();

        Thread.sleep(40000);

        driver.switchTo().window(winHandleBefore);
//        driver.quit();
    }

}
