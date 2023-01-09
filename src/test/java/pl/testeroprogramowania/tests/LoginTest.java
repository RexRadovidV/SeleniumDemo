package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {


        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .loginValidData("test1@test.pl", "test1@test.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void loginWithInvalidPasswordTest() {


        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .loginInvalidData("test1@test.pl", "@test.pl")
                .getError();

        Assert.assertTrue(error.getText().contains("Incorrect username or password."));
    }
}
