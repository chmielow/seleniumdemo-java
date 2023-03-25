package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

@Test
public class LogInTest extends BaseTest {
    public void LogInUserTest() {
        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .logInValidData("test@test.pl", "test@test.pl")
                .getDashBoardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    public void LogInUserWithInvalidPasswordTest() {
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .logInInvalidData("test@test.pl", "123test@test.pl")
                .getError();

        Assert.assertTrue(error.getText().contains("ERROR"));
    }
}
