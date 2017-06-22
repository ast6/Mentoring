package sc.actions;

import sc.pages.LogInPage;

public class LogInPageActions {

    private LogInPage logInPage = new LogInPage();

    public void clickScSignInButton() {

        logInPage.getScSignInButton().click();

    }

}
