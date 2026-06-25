package Framework.TestCases;

import Framework.Utility.CartMethods;
import Framework.Utility.DriverFactory;
import Framework.Utility.ProductMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC015_MultipleProductsCart extends BaseTest {

    @Test
    public void multipleProductsCartTest() throws InterruptedException {

        ProductMethods product =
                new ProductMethods(
                        DriverFactory.getDriver());

        CartMethods cart =
                new CartMethods(
                        DriverFactory.getDriver());

        // Add First Product
        product.clickFirstProduct();

        System.out.println(
                "First Product Name : "
                        + product.getProductName());

        cart.addProductToCart();

        System.out.println(
                "Cart Count After First Product : "
                        + cart.getCartCount());

        DriverFactory.getDriver()
                .navigate()
                .back();

        Thread.sleep(2000);

        product.openSecondProduct();

        System.out.println(
                "Second Product Name : "
                        + product.getProductName());

        cart.addProductToCart();

        // if no products are added
        Assert.assertTrue(
                Integer.parseInt(cart.getCartCount()) >= 1,
                "No Products Added To Cart");

        System.out.println(
                "Cart Count After Second Product : "
                        + cart.getCartCount());
    }
}