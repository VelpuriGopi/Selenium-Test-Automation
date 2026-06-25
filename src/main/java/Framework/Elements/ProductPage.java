package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @FindBy(xpath = "(//h5[@data-test='product-name'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "(//h5[@data-test='product-name'])[2]")
    public WebElement secondProduct;

    @FindBy(xpath = "//h1[@data-test='product-name']")
    public WebElement productName;

    @FindBy(xpath = "//button[@data-test='add-to-cart']")
    public WebElement addToCartButton;
}