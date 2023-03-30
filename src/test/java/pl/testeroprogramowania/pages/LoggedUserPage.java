package pl.testeroprogramowania.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.testeroprogramowania.utils.SeleniumHelper;

public class LoggedUserPage {

    private final WebDriver driver;

    @FindBy(linkText = "Dashboard")
    private WebElement dashBoardLink;

    public LoggedUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getDashBoardLink() {
        SeleniumHelper.waitForElementToBeVisible(driver, dashBoardLink);
        return dashBoardLink;
    }

}
