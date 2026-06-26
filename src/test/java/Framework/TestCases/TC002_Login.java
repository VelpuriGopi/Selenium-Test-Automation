package Framework.TestCases;

import Framework.Base.BaseTest;
import Framework.Utility.AccountMethods;
import Framework.Utility.DriverFactory;
import Framework.Utility.HomeMethods;
import Framework.Utility.LoginMethods;
import Framework.Utility.TestDataReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_Login extends BaseTest {

    @Test
    public void validLoginTest() {

        HomeMethods home = new HomeMethods(
                DriverFactory.getDriver());

        LoginMethods login = new LoginMethods(
                DriverFactory.getDriver());

        TestDataReader data = new TestDataReader();

        home.clickSignIn();

        login.login(
                data.getData("validEmail"),
                data.getData("validPassword")
        );

        AccountMethods account =
                new AccountMethods(
                        DriverFactory.getDriver());

        Assert.assertTrue(
                account.isMyAccountDisplayed(),
                "Login Failed");

//        Assert.assertEquals(
//                DriverFactory.getDriver().getCurrentUrl(),
//                "https://practicesoftwaretesting.com/account");

//        Assert.assertTrue(
//                DriverFactory.getDriver()
//                        .getCurrentUrl()
//                        .contains("/account"));

        System.out.println("Login Test Passed Successfully");
    }
}