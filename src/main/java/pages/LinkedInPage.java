package pages;

import infra.BasePage;
import org.openqa.selenium.WebDriver;

public class LinkedInPage extends BasePage {

    public LinkedInPage(WebDriver driver) {
        super(driver);
    }

    public String getLinkedInPageTitle(){
        return getTitlePage();

    }
}
