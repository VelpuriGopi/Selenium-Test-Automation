package Framework.TestCases;

import Framework.TestCases.Base.BaseTest;
import Framework.Utility.DriverFactory;
import Framework.Utility.LoginMethods;
import Framework.Utility.LogoutMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC025_LogoutValidation
        extends BaseTest {

    @Test
    public void logoutValidationTest() {

        DriverFactory.getDriver().get(
                "https://practicesoftwaretesting.com/auth/login");

        LoginMethods login =
                new LoginMethods(
                        DriverFactory.getDriver());

        login.login(
                "customer@practicesoftwaretesting.com",
                "welcome01");

        System.out.println(
                "Login Successful");

        LogoutMethods logout =
                new LogoutMethods(
                        DriverFactory.getDriver());

        logout.logout();

        Assert.assertTrue(
                logout.isSignInDisplayed(),
                "Logout Failed");

        System.out.println(
                "Logout Validation Passed");
    }

    //Difference Between TC012 and TC025

    //TC025_LogoutValidation
    //
    //Login
    //↓
    //Logout
    //↓
    //Verify Sign In Displayed
    //↓
    //Assertion
    //↓
    //Pass


    //
    //TC012_Logout
    //
    //Login
    //↓
    //Logout
    //↓
    //Pass
    //
}