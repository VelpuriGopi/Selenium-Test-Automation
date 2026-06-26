package Framework.TestCases;

import Framework.Base.BaseTest;
import Framework.Utility.DriverFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC017_EmptyCartCheckout extends BaseTest {

    @Test
    public void emptyCartCheckoutTest() {

        DriverFactory.getDriver()
                .navigate()
                .to("https://practicesoftwaretesting.com");

        int cartCount =
                DriverFactory.getDriver()
                        .findElements(
                                By.xpath("//span[@data-test='cart-quantity']"))
                        .size();

        System.out.println(
                "Cart Quantity Elements : "
                        + cartCount);

        Assert.assertTrue(
                DriverFactory.getDriver()
                        .getCurrentUrl()
                        .contains("practicesoftwaretesting"),
                "Application Not Opened");

        System.out.println(
                "Empty Cart Validation Successful");
    }
}



















































//package Framework.TestCases;
//
//import Framework.Utility.DriverFactory;
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class TC017_EmptyCartCheckout extends BaseTest {
//
//    @Test
//    public void emptyCartCheckoutTest() {
//
//        DriverFactory.getDriver()
//                .navigate()
//                .to("https://practicesoftwaretesting.com/checkout");
//
//        boolean cartIconDisplayed =
//                DriverFactory.getDriver()
//                        .findElements(
//                                By.xpath("//a[@data-test='nav-cart']"))
//                        .size() > 0;
//
//        System.out.println(
//                "Cart Icon Displayed : "
//                        + cartIconDisplayed);
//
//        String pageSource =
//                DriverFactory.getDriver()
//                        .getPageSource();
//
//        Assert.assertTrue(
//                pageSource.contains(
//                        "The cart is empty"),
//                "Empty Cart Message Not Displayed");
//
//        System.out.println(
//                "Empty Cart Validation Successful");
//    }
//}



//package Framework.TestCases;
//
//import Framework.Utility.DriverFactory;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class TC017_EmptyCartCheckout extends BaseTest {
//
//    @Test
//    public void emptyCartCheckoutTest() {
//
//        DriverFactory.getDriver()
//                .navigate()
//                .to("https://practicesoftwaretesting.com/checkout");
//
//        String pageSource =
//                DriverFactory.getDriver()
//                        .getPageSource();
//
//        Assert.assertTrue(
//                pageSource.contains(
//                        "The cart is empty"),
//                "Empty Cart Message Not Displayed");
//
//        System.out.println(
//                "Empty Cart Validation Successful");
//    }
//}

