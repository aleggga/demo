package product;

import core.BaseSeleniumTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleSeleniumTest extends BaseSeleniumTest {

    private final static String SEARCH_STRING = "Shakira";

    @Test
    public void checkSearch() {

        MainSeleniumPage mainPage = new MainSeleniumPage();
        SearchResultsPage searchResultsPage = mainPage.searchFor(SEARCH_STRING);
        searchResultsPage.checkSearchResults(SEARCH_STRING);
    }


}
