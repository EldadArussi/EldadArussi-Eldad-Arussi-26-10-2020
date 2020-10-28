package infra;

import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;

public class Utilities extends BaseTest {

    // This function scrolls to the bottom of the page
    public void scrollToBottomPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    // This function switch tabs by index
    public void switchTabByIndex(int index){
        ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tab.get(index));
    }

    public void simpleWaitBefore(int timeToWait){
        try
        {
            Thread.sleep(timeToWait*1000);
        }catch(InterruptedException e){
            System.out.println(e);}
    }

}
