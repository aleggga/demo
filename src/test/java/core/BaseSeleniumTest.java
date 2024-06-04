package core;

import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import io.qameta.allure.Issue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class BaseSeleniumTest {

    protected WebDriver driver;

    @BeforeEach
    private void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
    }
  @AfterEach
    private void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    @Issue("AUTH-123")
    @Description("This test attempts to log into the website using a login and a password. Fails if any error happens.\n\nNote that this test does not test 2-Factor Authentication.")
    public void openHomePage() {
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        WebElement userNameInput = driver.findElement(By.cssSelector(".input[name='username']"));
        assertTrue((userNameInput.isDisplayed()));
    }

}
