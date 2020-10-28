package pages;

import infra.BasePage;
import org.openqa.selenium.WebDriver;

public class CompanyWebsitePage extends BasePage {

    public CompanyWebsitePage(WebDriver driver) {
        super(driver);
    }

    public String getCompanyWebsitePageTitle(){
        return getTitlePage();

    }
}
