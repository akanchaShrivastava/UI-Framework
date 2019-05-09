package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver= null;
    String browser;


    @BeforeTest(alwaysRun = true)
    public void setUp() throws IOException {

        String currentUsersWorkingDir = System.getProperty("user.dir");
        Properties prop=new Properties();
        FileInputStream input=new FileInputStream(currentUsersWorkingDir+"/src/config.properties");
        prop.load(input);
        browser=prop.getProperty("browser");


        System.out.println("Dir is " + currentUsersWorkingDir);
        if(browser.equalsIgnoreCase("firefox")) {

            driver= new FirefoxDriver();
        }
            else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", currentUsersWorkingDir + "/src/test/resources/chromedriver");
            driver=new ChromeDriver();


            }

///Users/vapasi/IdeaProjects/VapasiUiFramework/src/config.properties
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(prop.getProperty("url"));

    }
    @AfterTest(alwaysRun = true)
    public void teardown() {

        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
