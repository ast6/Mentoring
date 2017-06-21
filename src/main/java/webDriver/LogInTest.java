package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sc.DriverUtils;
import sc.actions.LogInPageActions;
import sc.pages.LogInPage;


public class LogInTest {

    private WebDriver driver = DriverUtils.getFoxDriver();
    LogInPageActions logInPageActions = new LogInPageActions();
    LogInPage logInPage = new LogInPage();

    public void LoggingSteps() throws Throwable {

        driver.get("https://skins.cash");

//        String parentHandle = driver.getWindowHandle();
        logInPage.getSignInButton();
        logInPageActions.clickSignInButton();

        Thread.sleep(20000);

//        for (String winHandle : driver.getWindowHandles()) {
//            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
//        }

        driver.findElement(By.xpath("//*[@id='steamAccountName']")).sendKeys("shumisteam001");
        driver.findElement(By.xpath("//*[@id='steamPassword']")).sendKeys("8GLtSBfhYzICQENO");
        driver.findElement(By.xpath("//*[@id='imageLogin']")).click();

        Thread.sleep(70000);
        driver.quit();
    }

}
