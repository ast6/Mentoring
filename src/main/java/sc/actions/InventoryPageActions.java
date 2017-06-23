package sc.actions;

import org.openqa.selenium.WebDriver;
import sc.pages.InventoryPage;

import static sc.DriverUtils.getFoxDriver;

public class InventoryPageActions {

    private WebDriver driver = getFoxDriver();
    private InventoryPage inventoryPage = new InventoryPage();

    public void clickCsToggle() {
        inventoryPage.getCsToggle().click();
    }

    public void clickDotaToggle() {
        inventoryPage.getDotaToggle().click();
    }
    public void clickTfToggle() {
        inventoryPage.getTfToggle().click();
    }

}
