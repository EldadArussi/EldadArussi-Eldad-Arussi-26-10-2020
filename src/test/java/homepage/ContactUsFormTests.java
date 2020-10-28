package homepage;

import infra.BaseTest;
import infra.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ThankYouPage;
import pages.homepage.ContactUsForm;
import java.util.Arrays;
import java.util.List;

public class ContactUsFormTests extends BaseTest {

    @Test
    // This test checks the behavior of the system when entering valid details
    public void submitValidDetails () {
        String expectedSuccessMessageTitle = "תודה!";
        ContactUsForm contactUsForm = new ContactUsForm(driver);
        contactUsForm.setName("test");
        contactUsForm.setEmail("justfortest@gmail.com");
        contactUsForm.setPhone("0545938577");
        contactUsForm.setCompany("My Company");
        contactUsForm.clickOnSendDetailsBtn();

        ThankYouPage thankYouPage = new ThankYouPage(driver);

        Assert.assertEquals(thankYouPage.getSuccessMessageTitle(), expectedSuccessMessageTitle);
    }

    @Test
    // This test checks the behavior of the system when no value is entered
    public void submitWithoutAnyDetail () {
        List<String> expectedTextsListInputError = Arrays.asList("שדה שם הוא שדה חובה", "שדה חברה הוא שדה חובה","שדה אימייל הוא שדה חובה","שדה טלפון הוא שדה חובה");
        ContactUsForm contactUsForm = new ContactUsForm(driver);
        Utilities util = new Utilities();
        util.scrollToBottomPage();
        contactUsForm.clickOnSendDetailsBtn();

        Assert.assertEquals(contactUsForm.getTextsOfInputErrorsList(), expectedTextsListInputError);
    }
}
