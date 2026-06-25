package Framework.Utility;

import Framework.Elements.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterMethods {

    WebDriver driver;

    public RegisterMethods(WebDriver driver) {

        this.driver = driver;
    }

    public void fillRegistrationForm() {

        RegisterPage rp =
                PageFactory.initElements(
                        driver,
                        RegisterPage.class);

        TestDataReader data =
                new TestDataReader();

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementVisible(rp.firstName)
                .sendKeys(data.getData("firstname"));

        wait.waitForElementVisible(rp.lastName)
                .sendKeys(data.getData("lastname"));

        wait.waitForElementVisible(rp.dob)
                .sendKeys(data.getData("dob"));

        Select country =
                new Select(
                        wait.waitForElementVisible(
                                rp.country));

        country.selectByVisibleText(
                data.getData("country"));

        wait.waitForElementVisible(rp.postalCode)
                .sendKeys(data.getData("postalcode"));

        wait.waitForElementVisible(rp.houseNumber)
                .sendKeys(data.getData("housenumber"));

        wait.waitForElementVisible(rp.street)
                .sendKeys(data.getData("street"));

        wait.waitForElementVisible(rp.city)
                .sendKeys(data.getData("city"));

        wait.waitForElementVisible(rp.state)
                .sendKeys(data.getData("state"));

        wait.waitForElementVisible(rp.phone)
                .sendKeys(data.getData("phone"));

        wait.waitForElementVisible(rp.email)
                .sendKeys(data.getData("registerEmail"));

        wait.waitForElementVisible(rp.password)
                .sendKeys(data.getData("registerPassword"));
    }

    public void clickRegisterButton() {

        RegisterPage rp =
                PageFactory.initElements(
                        driver,
                        RegisterPage.class);

        WaitUtils wait =
                new WaitUtils(driver);

        wait.waitForElementClickable(
                        rp.registerButton)
                .click();
    }
}