package pages;

import infra.BasePage;
import org.openqa.selenium.WebDriver;

public class FacebookPage extends BasePage {

    public FacebookPage(WebDriver driver) {
        super(driver);
    }

    public String getFacebookPageTitle(){
        return getTitlePage();
    }
}
