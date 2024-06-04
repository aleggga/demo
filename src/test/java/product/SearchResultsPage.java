package product;

import core.BaseSeleniumPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class SearchResultsPage extends BaseSeleniumPage {


    @FindBy(css = ".im")
    private ArrayList<WebElement> searchResult;

    @FindBy(css = ".im h2 a")
    private By searchResultName;


    public ArrayList<WebElement> getSearchResults() {
        return searchResult;
    }

    private String getSearchResultItemName(WebElement searchItem) {
        return searchItem.findElement(searchResultName).getText();
    }

    public SearchResultsPage checkSearchResults(String expectedResult) {
        Assertions.assertTrue(
                getSearchResultItemName(getSearchResults().stream()
                        .filter(s -> getSearchResultItemName(s).contains(expectedResult))
                        .findAny()
                        .orElse(null)) != null);

        return this;
    }
}
