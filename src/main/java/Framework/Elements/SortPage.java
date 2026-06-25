package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortPage {

    @FindBy(css = "select[data-test='sort']")
    public WebElement sortDropdown;
}