package product;

import core.BaseSelenideTest;
import org.junit.jupiter.api.Test;

public class SampleSelenideTest extends BaseSelenideTest {

    private final static String BASE_URL = "http://google.com";

    @Test
    public void checkSearch() {
        MainSelenidePage  mainPage = new MainSelenidePage(BASE_URL);
    }
}
