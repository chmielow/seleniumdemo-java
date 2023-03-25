package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

@Test
public class RegisterTest extends BaseTest {
    public void registerUserTest() {

        int randomNumber = (int) (Math.random()*1000);
        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .registerUser(randomNumber+"test@test.pl", "7test@test.pl")
                .getDashBoardLink();

        Assert.assertEquals(dashboardLink.getText(),"Dashboard");

    }
    public void registerUserWithSameEmailTest() {


        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .registerUser("test@test.pl", "7test@test.pl")
                .getError();
        Assert.assertEquals(error.getText(),"Error: An account is already registered with your email address. Please log in.");
        Assert.assertTrue(error.getText().contains("Error"));

    }
}
