package pl.testeroprogramowania.tests;

import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

@Test
public class RegisterTest extends BaseTest {
    public void registerUserTest() {
        HomePage homePage = new HomePage(driver);
        homePage
                .openMyAccountPage()
                .registerUser("4test@test.pl","4test@test.pl");



    }
}
