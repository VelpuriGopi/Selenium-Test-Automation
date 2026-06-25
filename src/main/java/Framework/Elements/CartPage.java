        package Framework.Elements;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

        public class CartPage {

            @FindBy(xpath = "//button[@data-test='add-to-cart']")
            public WebElement addToCartButton;

            @FindBy(xpath = "//a[@data-test='nav-cart']")
            public WebElement cartIcon;

            @FindBy(xpath = "//button[@data-test='proceed-1']")
            public WebElement proceedToCheckoutButton;

            @FindBy(xpath = "//span[@data-test='cart-quantity']")
            public WebElement cartQuantity;

//            @FindBy(xpath = "//button[contains(@class,'btn-danger')]")
//            public WebElement removeButton;

            @FindBy(xpath = "//a[contains(@class,'btn-danger')]")
            public WebElement removeButton;

//            @FindBy(xpath = "//a[contains(@class,'btn-danger') and .//*[name()='svg']]")
//            public WebElement removeButton;
        }