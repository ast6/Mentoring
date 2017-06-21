package sc.pages;
//add locators

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static sc.DriverUtils.getFoxDriver;

public class LogInPage {

    private WebDriver driver = getFoxDriver();

    public By steamAccountNameButtonBy = By.xpath("//*[@id='steamAccountName']");
    public By steamAccountPasswordButtonBy = By.xpath("//*[@id='steamPassword']");
    public By steamSignInButtonBy = By.xpath("//*[@id='imageLogin']");
    public By scSignInButtonBy = By.xpath("//*[@class='btn btn-signin']");

    public WebElement getLogInButton() {
        return driver.findElement(scSignInButtonBy);
    }
    public WebElement getSteamSignInButton() {
        return driver.findElement(steamSignInButtonBy);
    }
    public WebElement getSteamAccountPasswordButton() {
        return driver.findElement(steamAccountPasswordButtonBy);
    }
    public WebElement getSteamAccountNameButton() {
        return driver.findElement(steamAccountNameButtonBy);
    }
}

