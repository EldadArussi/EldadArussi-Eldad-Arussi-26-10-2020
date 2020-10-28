package homepage;

import infra.BaseTest;
import infra.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CompanyWebsitePage;
import pages.FacebookPage;
import pages.LinkedInPage;
import pages.WhatsappPage;
import pages.homepage.ContactUsBottom;

public class ContactUsBottomTests extends BaseTest {

     @Test
    // This test goes to the company's LinkedIn via the icon
    public void moveToLinkedinViaIcon () {

         String expectedLinkedInPagePageTitle = "linkedin";
         Utilities util = new Utilities();
         util.scrollToBottomPage();

         ContactUsBottom contactUsBottom = new ContactUsBottom(driver);
         contactUsBottom.clickOnLinkedinLinkIcon();

         LinkedInPage linkedInPage = new LinkedInPage(driver);
         util.switchTabByIndex(1);

         Assert.assertTrue(linkedInPage.getLinkedInPageTitle().toLowerCase().contains(expectedLinkedInPagePageTitle));
    }

     @Test
     // This test goes to the company's whatsapp via the icon
     public void moveToWhatsappViaIcon () {

          String expectedLinkedInPagePageTitle = "whatsapp";
          Utilities util = new Utilities();
          util.scrollToBottomPage();

          ContactUsBottom contactUsBottom = new ContactUsBottom(driver);
          contactUsBottom.clickOnWhatsappLinkIcon();

          WhatsappPage whatsappPage = new WhatsappPage(driver);
          util.switchTabByIndex(1);

          Assert.assertTrue(whatsappPage.getWhatsappPageTitle().toLowerCase().contains(expectedLinkedInPagePageTitle));
     }

     @Test
     // This test goes to the company's Facebook via the icon
     public void moveToFacebookViaIcon () {

          String expectedLinkedInPagePageTitle = "facebook";
          Utilities util = new Utilities();
          util.scrollToBottomPage();

          ContactUsBottom contactUsBottom = new ContactUsBottom(driver);
          contactUsBottom.clickOnFacebookLinkIcon();

          FacebookPage facebookPage = new FacebookPage(driver);
          util.switchTabByIndex(1);

          Assert.assertTrue(facebookPage.getFacebookPageTitle().toLowerCase().contains(expectedLinkedInPagePageTitle));
     }

     @Test
     // This test goes to the company's Facebook via the icon
     public void moveToWebsiteViaIcon () {

          String expectedLinkedInPagePageTitle = "fullstack & frontend firm";
          Utilities util = new Utilities();
          util.scrollToBottomPage();

          ContactUsBottom contactUsBottom = new ContactUsBottom(driver);
          contactUsBottom.clickOnCompanyWebsiteLinkIcon();

          CompanyWebsitePage companyWebsitePage = new CompanyWebsitePage(driver);
          util.switchTabByIndex(1);

          Assert.assertTrue(companyWebsitePage.getCompanyWebsitePageTitle().toLowerCase().contains(expectedLinkedInPagePageTitle));
     }
}
