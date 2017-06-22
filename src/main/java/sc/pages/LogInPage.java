package sc.pages;
//add locators

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static sc.DriverUtils.getFoxDriver;

public class LogInPage {

    private WebDriver driver = getFoxDriver();

    public LogInPage() {
        PageFactory.initElements(driver, this);
    }

   @FindBy(id = "steamAccountName")
    private WebElement steamAccountNameButtonBy;
   @FindBy(id = "steamPassword")
    private WebElement steamAccountPasswordButtonBy;
   @FindBy(id = "imageLogin")
    private WebElement steamSignInButtonBy;
   @FindBy(css = "button[class=\"btn btn-signin\"]")
   private WebElement scSignInButtonBy;

    public WebElement getScSignInButton() {
             return scSignInButtonBy;
    }
    public WebElement getSteamSignInButton() {
        return steamSignInButtonBy;
    }
    public WebElement getSteamAccountPasswordButton() {
        return steamAccountPasswordButtonBy;
    }
    public WebElement getSteamAccountNameButton() {
        return steamAccountNameButtonBy;
    }


//    public By steamAccountNameButtonBy = By.xpath("//*[@id='steamAccountName']");
//    public By steamAccountPasswordButtonBy = By.xpath("//*[@id='steamPassword']");
//    public By steamSignInButtonBy = By.xpath("//*[@id='imageLogin']");
//    public By scSignInButtonBy = By.xpath("//*[@class='btn btn-signin']");
//
//    public WebElement getScSignInButton() {
//        return driver.findElement(scSignInButtonBy);
//    }
//    public WebElement getSteamSignInButton() {
//        return driver.findElement(steamSignInButtonBy);
//    }
//    public WebElement getSteamAccountPasswordButton() {
//        return driver.findElement(steamAccountPasswordButtonBy);
//    }
//    public WebElement getSteamAccountNameButton() {
//        return driver.findElement(steamAccountNameButtonBy);
//    }
}

