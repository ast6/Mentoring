package sc.pages;
//add locators

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static sc.DriverUtils.getFoxDriver;

public class LogInPage {

    private WebDriver driver = getFoxDriver();

    public WebElement signInButton = driver.findElement(By.xpath("//*[@class='btn btn-signin']"));
    public By signInButtonBy = By.xpath("//*[@class='btn btn-signin']");

    public WebElement getSignInButton() {
        return signInButton;
    }


}

