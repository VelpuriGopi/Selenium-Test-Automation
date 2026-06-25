package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage {

    @FindBy(xpath = "//h5[@data-test='product-name']")
    public List<WebElement> productNames;

}