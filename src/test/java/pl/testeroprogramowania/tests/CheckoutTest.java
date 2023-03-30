package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.models.Customer;
import pl.testeroprogramowania.pages.HomePage;

@Test
public class CheckoutTest extends BaseTest {
    public void checkoutTest() {
        Customer customer = new Customer();
        customer.setFirstName("Marcin");
        customer.setLastName("Tester");
        customer.setCompanyName("BMW");
        customer.setCountry("Poland");
        customer.setStreet("Testowa");
        customer.setFlatNumber("11");
        customer.setZipCode("12345");
        customer.setCity("Warszawa");
        customer.setPhone("123456789");
        customer.setEmail("test@test.pl");

        new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart()
                .openAddressDetails()
                .fillAddressDetails(customer,"Some random comment");

    }

}
