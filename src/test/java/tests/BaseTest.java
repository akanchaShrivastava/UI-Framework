package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {

        String currentUsersWorkingDir = System.getProperty("user.dir");
        System.out.println("Dir is " + currentUsersWorkingDir);
        System.setProperty("webdriver.chrome.driver", currentUsersWorkingDir + "/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://spree-vapasi.herokuapp.com");

    }
    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
