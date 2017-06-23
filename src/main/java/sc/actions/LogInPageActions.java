package sc.actions;

import org.openqa.selenium.WebDriver;

import sc.pages.LoginPage;

import static sc.DriverUtils.getFoxDriver;

public class LogInPageActions {

    private WebDriver driver = getFoxDriver();

    private LoginPage loginPage = new LoginPage(this.driver);

    public void clickScSignInButton() {
        loginPage.getLogInButton().click();
    }

}
