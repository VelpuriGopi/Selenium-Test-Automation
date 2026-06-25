package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {

    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    public WebElement myAccountHeading;

}