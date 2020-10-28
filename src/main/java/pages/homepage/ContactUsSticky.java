package pages.homepage;

import infra.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsSticky extends BasePage {

    @FindBy(name = "name")private WebElement nameInput;
    @FindBy(name = "email")private WebElement emailInput;
    @FindBy(name = "phone")private WebElement phoneInout;
    @FindBy(xpath = "//*[contains(@class,'Footer__Button')]")private WebElement sendDetailsBtn;
    @FindBy(xpath = "//*[contains(@class,'Footer__InputError')]")private WebElement inputError;


    public ContactUsSticky(WebDriver driver) {
        super(driver);
    }


    public void setName(String text){
        fillText(nameInput,text);
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

    public String getTextInputError(){
        return getTextOfElement(inputError);
    }


}
