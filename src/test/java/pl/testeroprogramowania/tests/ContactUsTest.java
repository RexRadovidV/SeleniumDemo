package pl.testeroprogramowania.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class ContactUsTest extends BaseTest {


    @Test
    public void ContactTest() {

        HomePage homePage = new HomePage(driver)
                .contactUs("Wojtek", "wojtek.rachon@interia.pl", "Test");

        Assert.assertEquals(homePage.assertData().getText(), "It is demo page! We are not sending emails!");
    }
}
