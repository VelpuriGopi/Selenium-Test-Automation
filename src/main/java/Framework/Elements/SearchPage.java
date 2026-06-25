
package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

    @FindBy(id = "search-query")
    public WebElement searchBox;

    @FindBy(css = "button[data-test='search-submit']")
    public WebElement searchButton;
}




//package Framework.Elements;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class SearchPage {
//
//    @FindBy(id = "search-query")
//    public WebElement searchBox;
//
//}