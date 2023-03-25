package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.testeroprogramowania.utils.SeleniumHelper;

public class MyAccountPage {

    @FindBy(id = "reg_email")
    private WebElement regEmailInsert;
    @FindBy(id = "reg_password")
    private WebElement regPasswordInsert;
    @FindBy(name = "register")
    private WebElement registerButton;
    @FindBy(xpath = "//ul[@class='woocommerce-error']//li")
    private WebElement error;
    @FindBy(id = "username")
    private WebElement userNameImput;
    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(name = "login")
    private WebElement loginButton;
    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoggedUserPage registerUserValidData(String email, String password) {

        registerUser(email, password);
        return new LoggedUserPage(driver);
    }

    public MyAccountPage registerUserInvalidData(String email, String password) {
        registerUser(email, password);
        return this;
    }

    private void registerUser(String email, String password) {
        regEmailInsert.sendKeys(email);
        regPasswordInsert.sendKeys(password);
        SeleniumHelper.waitForElementToBeVisible(driver, registerButton);
        registerButton.click();

    }

    public LoggedUserPage logInValidData(String userName, String password) {
        logIn(userName, password);
        return new LoggedUserPage(driver);
    }

    public MyAccountPage logInInvalidData(String userName, String password) {
        logIn(userName, password);
        return this;
    }

    public void logIn(String userName, String password) {
        userNameImput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public WebElement getError() {
        return error;
    }
}
