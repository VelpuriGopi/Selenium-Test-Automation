package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilterPage {

    @FindBy(xpath = "//label[contains(.,'Hammer')]")
    public WebElement hammerCheckbox;

    @FindBy(xpath = "//h5[@data-test='product-name']")
    public List<WebElement> productList;

    @FindBy(css = ".ngx-slider-pointer-max")
    public WebElement maxPriceSlider;
}