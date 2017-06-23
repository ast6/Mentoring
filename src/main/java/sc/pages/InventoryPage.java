package sc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class InventoryPage {

    @FindBy(id = ".inventory__game-item:nth-child(1)")
    private WebElement csToggleBy;
    @FindBy(id = ".inventory__game-item:nth-child(2)")
    private WebElement dotaToggleBy;
    @FindBy(css = ".inventory__game-item:nth-child(3)")
    private WebElement tfToggleBy;

    public WebElement getCsToggle() {
        return csToggleBy;
    }

    public WebElement getDotaToggle() {
        return dotaToggleBy;
    }

    public WebElement getTfToggle() {
        return tfToggleBy;
    }

}
