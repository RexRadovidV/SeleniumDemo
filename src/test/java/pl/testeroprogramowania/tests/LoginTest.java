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
                .loginValidData("test100@test.pl", "test100@test.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

//    @Test
//    public void loginWithInvalidDataTest() {
//
//
//        WebElement error = new HomePage(driver)
//                .openMyAccountPage()
//                .loginInvalidData("tes@testpl", "@test.pl")
//                .getError();
//
//        Assert.assertTrue(error.getText().contains("Incorrect username or password."));
//    }
}
