package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

@Test
public class RegisterTest extends BaseTest {
    public void registerUserTest() {
        WebElement entryTitle = new HomePage(driver)
                .openMyAccountPage()
                .registerUser("6test@test.pl", "6test@test.pl")
                .getEntryTitle();
        Assert.assertTrue(entryTitle.isDisplayed());
        Assert.assertEquals(entryTitle.getText(),"My account");


    }
}
