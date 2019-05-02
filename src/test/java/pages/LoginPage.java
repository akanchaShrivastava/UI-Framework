package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.net.URL;

public class LoginPage {


    private  WebDriver driver;
    @FindBy(id = "link-to-login")
    private WebElement login_link;

    @FindBy(id = "spree_user_email")
    private WebElement Username_link;

    @FindBy(id = "spree_user_password")
    private WebElement Password_link;

    @FindBy(name = "commit")
    private WebElement Login_button;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }

    public ProductLisingPage login(String emailid, String password) {


        login_link.click();
        Username_link.sendKeys(emailid);
        Password_link.sendKeys(password);
        Login_button.click();
        return new ProductLisingPage(driver);
    }
}
