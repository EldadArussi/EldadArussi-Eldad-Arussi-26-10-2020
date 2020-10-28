package homepage;

import infra.BaseTest;
import infra.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WhatsappPage;
import pages.homepage.SideElements;

public class SideElementsTests extends BaseTest {
    @Test
    // This test checks that is possible to back to the top page using the side arrow
    public void backToTopPageUsingArrow () {
        Utilities util = new Utilities();
        util.scrollToBottomPage();

        SideElements sideElements = new SideElements(driver);
        sideElements.clickOnBackToTheTopBtn();
        util.simpleWaitBefore(3);

        Assert.assertFalse(sideElements.validateIfElementExist(sideElements.getArrowBackToTopPageBtn()));
    }

    @Test
    // This test goes to the company's whatsapp via the side icon
    public void moveToWhatsappViaSideIcon () {

        String expectedLinkedInPagePageTitle = "whatsapp";

        SideElements sideElements = new SideElements(driver);
        sideElements.clickOnSideWhatsappLinkIcon();

        WhatsappPage whatsappPage = new WhatsappPage(driver);
        Utilities util = new Utilities();
        util.switchTabByIndex(1);

        Assert.assertTrue(whatsappPage.getWhatsappPageTitle().toLowerCase().contains(expectedLinkedInPagePageTitle));
    }
}
