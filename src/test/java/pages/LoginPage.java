package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class LoginPage {


        WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver=driver;


    }

    public ProductLisingPage  login(String emailid, String password) {



        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys(emailid);
        driver.findElement(By.id("spree_user_password")).sendKeys(password);
        driver.findElement(By.name("commit")).click();
        return new ProductLisingPage(driver);
    }
}
