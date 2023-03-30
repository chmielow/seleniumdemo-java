package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

@Test
public class CheckoutTest extends BaseTest {
    public void checkoutTest() {
        new HomePage(driver).openShopPage().openProduct("Java Selenium WebDriver").addProductToCart();

    }

}
