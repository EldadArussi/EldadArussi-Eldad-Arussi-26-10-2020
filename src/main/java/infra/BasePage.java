package infra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    // This function sends text
    public void fillText(WebElement element,String text){
        element.sendKeys(text);

    }
    // This function clicks on an element
    public void clickOnElement(WebElement element){

        element.click();
    }
    // This function returns text of an element
    public String getTextOfElement(WebElement element){
        return element.getText();
    }

    // This function returns a text list of some elements
    public List<String> getTextOfListElements(List<WebElement> listElements){
        List<String> textOfListElements = new ArrayList<>();
        for(WebElement element : listElements)
            textOfListElements.add(element.getText());
        return textOfListElements;
    }
    // This function returns the page title
    public String getTitlePage(){
        return driver.getTitle();
    }

    // This function returns true/false if element is displayed
    public boolean validateIfElementExist(WebElement element){
        return element.isDisplayed();
    }

}
