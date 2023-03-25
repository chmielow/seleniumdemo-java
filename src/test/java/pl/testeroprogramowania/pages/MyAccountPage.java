package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MyAccountPage {

    @FindBy(id= "reg_email")
    private WebElement regEmailInsert;
    @FindBy(id="reg_password")
    private WebElement regPasswordInsert;
    @FindBy(name="register")
    private WebElement registerButton;
    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public LoggedUserPage registerUser(String email, String password) {

        regEmailInsert.sendKeys(email);
        regPasswordInsert.sendKeys(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        registerButton.click();
        //registerButton.click();
        return new LoggedUserPage(driver);


    }
}
