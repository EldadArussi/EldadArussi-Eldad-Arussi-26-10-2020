package pages;

import infra.BasePage;
import org.openqa.selenium.WebDriver;

public class WhatsappPage extends BasePage {

    public WhatsappPage(WebDriver driver) {
        super(driver);
    }

    public String getWhatsappPageTitle(){
        return getTitlePage();

    }
}
