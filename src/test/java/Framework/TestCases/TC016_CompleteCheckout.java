package Framework.TestCases;

import Framework.Base.BaseTest;
import Framework.Utility.CheckoutFlowMethods;
import Framework.Utility.DriverFactory;
import Framework.Utility.PaymentMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC016_CompleteCheckout extends BaseTest {

    @Test
    public void completeCheckoutTest() {

        CheckoutFlowMethods flow =
                new CheckoutFlowMethods(
                        DriverFactory.getDriver());

        flow.navigateToPaymentWithSecondProduct();

        PaymentMethods payment =
                new PaymentMethods(
                        DriverFactory.getDriver());

        payment.selectPaymentMethod();

        payment.fillCardDetails();

        payment.confirmOrder();

        String successMessage =
                payment.getSuccessMessage();

        System.out.println(
                "Success Message : "
                        + successMessage);

        Assert.assertTrue(
                successMessage.length() > 0,
                "Order Confirmation Failed");

        System.out.println(
                "Complete Checkout Successful");
    }
}