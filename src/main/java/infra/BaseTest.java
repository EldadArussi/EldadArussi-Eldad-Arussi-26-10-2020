package infra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    protected static WebDriver driver;
    protected static String urlHomePage = "https://automation.herolo.co.il/";


    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) throws Exception {
        switch(browser) {

            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eldad Arussi\\Downloads\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "InternetExplorer":
                System.setProperty("webdriver.ie.driver", "C:\\Users\\Eldad Arussi\\Downloads\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case "Firefox":
                System.setProperty("webdriver.firefox.driver", "C:\\Users\\Eldad Arussi\\Downloads\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                throw new Exception(browser + "browser is not exist");
        }

        driver.manage().window().maximize();
        driver.get(urlHomePage);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
