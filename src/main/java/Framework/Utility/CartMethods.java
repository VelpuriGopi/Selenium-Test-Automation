package Framework.Utility;

import Framework.Elements.CartPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartMethods {

    WebDriver driver;

    public CartMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart() {

        CartPage cp =
                PageFactory.initElements(
                        driver,
                        CartPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementClickable(
                        cp.addToCartButton)
                .click();
    }

    public String getCartCount() {

        CartPage cp =
                PageFactory.initElements(
                        driver,
                        CartPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        return wait.waitForElementVisible(
                        cp.cartQuantity)
                .getText();
    }

    public void openCart() {

        CartPage cp =
                PageFactory.initElements(
                        driver,
                        CartPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        System.out.println(
                "Before Open Cart URL : "
                        + driver.getCurrentUrl());

        wait.waitForElementClickable(
                        cp.cartIcon)
                .click();

        wait.waitForElementVisible(
                cp.proceedToCheckoutButton);

        System.out.println(
                "After Open Cart URL : "
                        + driver.getCurrentUrl());

        System.out.println(
                "After Open Cart Title : "
                        + driver.getTitle());
    }

    public void proceedToCheckout() {

        CartPage cp =
                PageFactory.initElements(
                        driver,
                        CartPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        System.out.println(
                "Current URL Before Proceed : "
                        + driver.getCurrentUrl());

        System.out.println(
                "Current Title Before Proceed : "
                        + driver.getTitle());

        wait.waitForElementClickable(
                cp.proceedToCheckoutButton);

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].click();",
                        cp.proceedToCheckoutButton);

        System.out.println(
                "Proceed To Checkout Clicked");

        wait.waitForElementVisible(
                cp.cartIcon);

        System.out.println(
                "URL After Proceed : "
                        + driver.getCurrentUrl());
    }



    public void removeProduct() {

        CartPage cp =
                PageFactory.initElements(
                        driver,
                        CartPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementClickable(
                        cp.removeButton)
                .click();

        driver.navigate().refresh();

        System.out.println(
                "Product Removed Successfully");
    }
}