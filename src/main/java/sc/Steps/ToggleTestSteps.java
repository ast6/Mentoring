package sc.Steps;

import org.openqa.selenium.WebDriver;
import sc.actions.InventoryPageActions;
import sc.pages.InventoryPage;
import sc.pages.LoginPage;

import static sc.DriverUtils.getFoxDriver;

public class ToggleTestSteps {

    private InventoryPageActions inventoryPageActions = new InventoryPageActions();
    private WebDriver driver = getFoxDriver();

    public void leftOnOnlyCs(){
        inventoryPageActions.clickDotaToggle();
        inventoryPageActions.clickTfToggle();
    }

}
