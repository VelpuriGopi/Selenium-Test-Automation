package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {

    @FindBy(css = "button[data-test='nav-menu']")
    public WebElement userDropdown;

    @FindBy(css = "a[data-test='nav-sign-out']")
    public WebElement signOutButton;

    @FindBy(css = "a[data-test='nav-sign-in']")
    public WebElement signInButton;
}