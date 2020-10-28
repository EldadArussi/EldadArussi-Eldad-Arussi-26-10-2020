package pages;

import infra.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThankYouPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class,'thankYou__title')]")private WebElement successMessageTitle;

    public ThankYouPage(WebDriver driver) {
        super(driver);
    }

    public String getSuccessMessageTitle(){
        return getTextOfElement(successMessageTitle);

    }

    public String getThankYouPageTitle(){
        return getTitlePage();

    }

}
