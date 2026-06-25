package Framework.TestCases;

import Framework.Utility.CartMethods;
import Framework.Utility.CheckoutLoginMethods;
import Framework.Utility.DriverFactory;
import Framework.Utility.ProductMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC008_CheckoutSignIn extends BaseTest {


    @Test
    public void checkoutSignInTest() throws InterruptedException {

        ProductMethods product =
                new ProductMethods(
                        DriverFactory.getDriver());

        product.clickFirstProduct();

        CartMethods cart =
                new CartMethods(
                        DriverFactory.getDriver());

        cart.addProductToCart();

        cart.openCart();

        cart.proceedToCheckout();

        CheckoutLoginMethods checkout =
                new CheckoutLoginMethods(
                        DriverFactory.getDriver());



        checkout.loginToCheckout(
                "customer@practicesoftwaretesting.com",
                "welcome01");

        Thread.sleep(5000);





        System.out.println(
                "Checkout Login Successful");


    }


}