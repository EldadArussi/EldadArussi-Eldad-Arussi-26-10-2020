package homepage;

import infra.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ThankYouPage;
import pages.homepage.ContactUsSticky;

public class ContactUsStickyTests extends BaseTest {

    @Test
    // This test checks the behavior of the system when entering valid details
    public void submitValidDetails () {
        String expectedSuccessMessageTitle = "תודה!";
        ContactUsSticky contactUsSticky = new ContactUsSticky(driver);
        contactUsSticky.setName("test");
        contactUsSticky.setEmail("justfortest@gmail.com");
        contactUsSticky.setPhone("0545938577");
        contactUsSticky.clickOnSendDetailsBtn();

        ThankYouPage thankYouPage = new ThankYouPage(driver);

        Assert.assertEquals(thankYouPage.getSuccessMessageTitle(), expectedSuccessMessageTitle);
    }

    @Test
    // This test checks the behavior of the system when a name field is empty
    public void submitWithAnEmptyNameField () {
        String expectedTextInputError = "שדה שם הוא שדה חובה";
        ContactUsSticky contactUsSticky = new ContactUsSticky(driver);
        contactUsSticky.setEmail("justfortest@gmail.com");
        contactUsSticky.setPhone("0545938577");
        contactUsSticky.clickOnSendDetailsBtn();

        Assert.assertEquals(contactUsSticky.getTextInputError(), expectedTextInputError);
    }

    @Test
    // This test checks the behavior of the system when a email field is invalid
    public void submitWithInvalidEmailAddress () {
        String expectedTextInputError = "כתובת אימייל לא חוקית";
        ContactUsSticky contactUsSticky = new ContactUsSticky(driver);
        contactUsSticky.setName("test");
        contactUsSticky.setEmail("justForTest.com");
        contactUsSticky.setPhone("0545938577");
        contactUsSticky.clickOnSendDetailsBtn();

        Assert.assertEquals(contactUsSticky.getTextInputError(), expectedTextInputError);
    }
}
