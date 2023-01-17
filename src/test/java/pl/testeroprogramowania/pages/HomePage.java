package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//span[text()='My account']")
    private WebElement myAccountLink;

    @FindBy(xpath = "//span[text()='Shop']")
    private WebElement shopLink;

    @FindBy(id = "nimble_name2083897189")
    private WebElement testData;

    @FindBy(id = "nimble_email2083897189")
    private WebElement emailData;

    @FindBy(id = "nimble_message2083897189")
    private WebElement messageData;

    @FindBy(id = "nimble_submit2083897189")
    private WebElement submitData;

    @FindBy(xpath = "//div[@id='sek-form-respond']")
    private WebElement doneData;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MyAccountPage openMyAccountPage() {
        myAccountLink.click();
        return new MyAccountPage(driver);
    }

    public ProductListPage openShopPage() {
        shopLink.click();
        return new ProductListPage(driver);
    }

    public HomePage contactUs(String name, String email, String message) {
        testData.sendKeys(name);
        emailData.sendKeys(email);
        messageData.sendKeys(message);
        submitData.click();
        return new HomePage(driver);
    }

    public WebElement assertData(){
        return doneData;
    }

}
