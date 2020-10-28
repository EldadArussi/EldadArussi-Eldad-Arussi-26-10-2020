package pages.homepage;

import infra.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsBottom extends BasePage {

    @FindBy(xpath = "//*[contains(@href,'linkedin')]")private WebElement linkedinLinkIcon;
    @FindBy(xpath = "//*[contains(@class,'socialMediaBar')]//*[contains(@href,'whatsapp')]")private WebElement whatsappLinkIcon;
    @FindBy(xpath = "//*[contains(@href,'facebook')]")private WebElement facebookLinkIcon;
    @FindBy(xpath = "//*[contains(@href,'herolo.co.il/')]")private WebElement companyWebsiteLinkIcon;

    public ContactUsBottom(WebDriver driver) {
        super(driver);
    }

    public void clickOnLinkedinLinkIcon(){
        clickOnElement(linkedinLinkIcon);
    }

    public void clickOnWhatsappLinkIcon(){
        clickOnElement(whatsappLinkIcon);
    }

    public void clickOnFacebookLinkIcon(){
        clickOnElement(facebookLinkIcon);
    }

    public void clickOnCompanyWebsiteLinkIcon(){
        clickOnElement(companyWebsiteLinkIcon);
    }


}
