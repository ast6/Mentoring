package sc.pages;
//add locators

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static sc.DriverUtils.getFoxDriver;

public class LogInPage {

    private WebDriver driver = getFoxDriver();

   @FindBy(id = "steamAccountName")
    private By steamAccountNameButtonBy;
   @FindBy(id = "steamPassword")
    private By steamAccountPasswordButtonBy;
   @FindBy(id = "imageLogin")
    private By steamSignInButtonBy;
   @FindBy(className = "btn btn-signin")
   private By scSignInButtonBy;

    public WebElement getLogInButton() {
        PageFactory.initElements(driver, this.scSignInButtonBy);
        return driver.findElement(scSignInButtonBy);
    }
    public WebElement getSteamSignInButton() {
        PageFactory.initElements(driver, this.steamSignInButtonBy);
        return driver.findElement(steamSignInButtonBy);
    }
    public WebElement getSteamAccountPasswordButton() {
        PageFactory.initElements(driver, this.steamAccountPasswordButtonBy);
        return driver.findElement(steamAccountPasswordButtonBy);
    }
    public WebElement getSteamAccountNameButton() {
        PageFactory.initElements(driver, this.steamAccountNameButtonBy);
        return driver.findElement(steamAccountNameButtonBy);
    }

//    public By steamAccountNameButtonBy = By.xpath("//*[@id='steamAccountName']");
//    public By steamAccountPasswordButtonBy = By.xpath("//*[@id='steamPassword']");
//    public By steamSignInButtonBy = By.xpath("//*[@id='imageLogin']");
//    public By scSignInButtonBy = By.xpath("//*[@class='btn btn-signin']");
//
//    public WebElement getLogInButton() {
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

