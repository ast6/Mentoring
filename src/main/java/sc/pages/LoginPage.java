package sc.pages;
//add locators

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends scPage {

    @FindBy(id = "steamAccountName")
    private WebElement steamAccountNameFieldBy;
    @FindBy(id = "steamPassword")
    private WebElement steamAccountPasswordFieldBy;
    @FindBy(id = "imageLogin")
    private WebElement steamSignInButtonBy;
    @FindBy(css = "button[class=\"btn btn-signin\"]")
    private WebElement scSignInButtonBy;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogInButton() {
        return scSignInButtonBy;
    }
    public WebElement getSteamSignInButton() {
        return steamSignInButtonBy;
    }
    public WebElement getSteamAccountPasswordField() {
        return steamAccountPasswordFieldBy;
    }
    public WebElement getSteamAccountNameField() {
        return steamAccountNameFieldBy;
    }

    // public By steamAccountNameFieldBy = By.xpath("//*[@id='steamAccountName']");
    // public By steamAccountPasswordFieldBy = By.xpath("//*[@id='steamPassword']");
    // public By steamSignInButtonBy = By.xpath("//*[@id='imageLogin']");
    // public By scSignInButtonBy = By.xpath("//*[@class='btn btn-signin']");
    //
    // public WebElement getLogInButton() {
    // return driver.findElement(scSignInButtonBy);
    // }
    // public WebElement getSteamSignInButton() {
    // return driver.findElement(steamSignInButtonBy);
    // }
    // public WebElement getSteamAccountPasswordField() {
    // return driver.findElement(steamAccountPasswordFieldBy);
    // }
    // public WebElement getSteamAccountNameField() {
    // return driver.findElement(steamAccountNameFieldBy);
    // }
}

