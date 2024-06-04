package product;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainSeleniumPage extends BaseSeleniumPage {

    @FindBy(xpath = "footer[role='contentinfo']")
    private WebElement footer;

    @FindBy(css = ".textfield[role='searchbox']")
    private WebElement searchInput;

    public MainSeleniumPage() {
        driver.get("https://mvnrepository.com/");
        PageFactory.initElements(driver, this);
    }

    public SearchResultsPage searchFor(String searchString) {
        searchInput.sendKeys(searchString);
        searchInput.submit();

        return PageFactory.initElements(driver, SearchResultsPage.class);
    }

}
