package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderDetailsPage {
    @FindBy(xpath = "//div[@class='woocommerce-order']//p")
    private WebElement orderNotice;
    @FindBy(xpath = "//td[contains(@class,'product-name')]")
    private WebElement produceName;

    public OrderDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getProduceName() {
        return produceName;
    }

    public WebElement getOrderNotice() {
        return orderNotice;
    }

}
