package sc.actions;

import sc.pages.LogInPage;

public class LogInPageActions {

    LogInPage logInPage = new LogInPage();
    public void clickSignInButton(){

        logInPage.getSignInButton().click();

    }

}
