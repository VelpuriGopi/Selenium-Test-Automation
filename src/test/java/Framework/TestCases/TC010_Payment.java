package Framework.TestCases;

import Framework.TestCases.Base.BaseTest;
import Framework.Utility.CheckoutFlowMethods;
import Framework.Utility.DriverFactory;
import Framework.Utility.PaymentMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC010_Payment extends BaseTest {

    @Test
    public void paymentTest() {

        CheckoutFlowMethods flow =
                new CheckoutFlowMethods(
                        DriverFactory.getDriver());

        flow.navigateToPayment();

        PaymentMethods payment =
                new PaymentMethods(
                        DriverFactory.getDriver());

        Assert.assertTrue(
                payment.isPaymentPageDisplayed(),
                "Payment Page Not Displayed");

        payment.selectPaymentMethod();

        System.out.println(
                "Payment Method Selected Successfully");
    }
}