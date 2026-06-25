package Framework.Utility;

import Framework.Elements.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class    ProductMethods {

    WebDriver driver;

    public ProductMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstProduct() {

        ProductPage pp =
                PageFactory.initElements(
                        driver,
                        ProductPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementClickable(
                        pp.firstProduct)
                .click();
    }

    public void openSecondProduct()  {

        ProductPage pp =
                PageFactory.initElements(
                        driver,
                        ProductPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementClickable(
                        pp.secondProduct)
                .click();
    }

//    public void openSecondProduct() {
//
//        ProductPage pp =
//                PageFactory.initElements(
//                        driver,
//                        ProductPage.class);
//
//        WaitUtils wait =
//                new WaitUtils(driver);
//
//        wait.waitForElementClickable(
//                        pp.secondProduct)
//                .click();
//    }
    public String getProductName() {

        ProductPage pp =
                PageFactory.initElements(
                        driver,
                        ProductPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        return wait.waitForElementVisible(
                        pp.productName)
                .getText();
    }

    public boolean isAddToCartDisplayed() {

        ProductPage pp =
                PageFactory.initElements(
                        driver,
                        ProductPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        return wait.waitForElementVisible(
                        pp.addToCartButton)
                .isDisplayed();
    }

    public boolean isProductInStock() {

        return !driver.getPageSource()
                .contains("Out of stock");
    }
}