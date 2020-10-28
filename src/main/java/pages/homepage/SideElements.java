package pages.homepage;

import infra.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideElements extends BasePage {

    @FindBy(xpath = "//*[contains(@class,'backToTop')]")private WebElement arrowBackToTopPageBtn;
    @FindBy(xpath = "//*[contains(@class,'callUsWhatsapp')]")private WebElement sideWhatsappLinkIcon;

    public SideElements(WebDriver driver) {
        super(driver);
    }

    public void clickOnBackToTheTopBtn(){
        clickOnElement(arrowBackToTopPageBtn);
    }

    public void clickOnSideWhatsappLinkIcon(){
        clickOnElement(sideWhatsappLinkIcon);
    }

    public WebElement getArrowBackToTopPageBtn(){
        return arrowBackToTopPageBtn;
    }
}
