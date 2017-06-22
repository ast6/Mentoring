package sc.actions;

import org.openqa.selenium.WebDriver;

import sc.pages.LogInPage;

import static sc.DriverUtils.getFoxDriver;

public class LogInPageActions {

    private WebDriver driver = getFoxDriver();

    private LogInPage logInPage = new LogInPage(this.driver);

    public void clickScSignInButton() {
        logInPage.getLogInButton().click();
    }

}
