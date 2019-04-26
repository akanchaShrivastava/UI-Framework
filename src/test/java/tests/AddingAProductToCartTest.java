package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class AddingAProductToCartTest extends BaseTest {




    @Test(priority = 1)
    public void adAProductToCart() throws InterruptedException {
        driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("spree@example.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("spree123");
        driver.findElement(By.name("commit")).click();

        driver.findElement(By.linkText("Ruby on Rails Bag")).click();
        //  driver.findElement(By.xpath("//span[@title='Ruby on Rails Bag']")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        // driver.findElement(By.linkText("Ruby on Rails Bag"));
        driver.findElement(By.id("cart-detail")).findElement(By.linkText("Ruby on Rails Bag"));
        List<WebElement> listOfItems = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item"));
        assertTrue(listOfItems.size() == 1);

       System.out.println(listOfItems.size());

        for (Iterator<WebElement> productIterator = listOfItems.iterator(); productIterator.hasNext(); ) {
            WebElement product= productIterator.next();
           System.out.println(product.getText());
         //  System.out.println(product.getAttribute("value"));

        }

    }





}
