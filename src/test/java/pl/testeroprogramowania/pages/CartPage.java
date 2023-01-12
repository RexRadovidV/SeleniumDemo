package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.testeroprogramowania.utils.SeleniumHelper;

public class CartPage {

    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']//a")
    private WebElement proceedToCheckoutButton;

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    public AddressDetailsPage openAddressDetails() throws InterruptedException {
        Thread.sleep(1000);
        proceedToCheckoutButton.click();
        return new AddressDetailsPage(driver);

    }
}
