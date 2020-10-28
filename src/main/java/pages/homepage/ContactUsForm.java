package pages.homepage;

import infra.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactUsForm extends BasePage {

    @FindBy(id = "name")private WebElement nameInput;
    @FindBy(id = "company")private WebElement companyInput;
    @FindBy(id = "email")private WebElement emailInput;
    @FindBy(id = "telephone")private WebElement phoneInout;
    @FindBy(xpath = "//*[contains(@class,'ButtonContainer')]//*[contains(@class,'ButtonContact')]")private WebElement sendDetailsBtn;
    @FindBy(xpath = "//*[contains(@class,'ErrorText')]")private List<WebElement> inputErrorList;

    public ContactUsForm(WebDriver driver) {
        super(driver);
    }


    public void setName(String text){
        fillText(nameInput,text);
    }

    public void setCompany(String text){
        fillText(companyInput,text);
    }

    public void setEmail(String text){
        fillText(emailInput,text);
    }

    public void setPhone(String text){
        fillText(phoneInout,text);
    }

    public void clickOnSendDetailsBtn(){
        clickOnElement(sendDetailsBtn);
    }

    public List<String> getTextsOfInputErrorsList(){
        return getTextOfListElements(inputErrorList);
    }
}
