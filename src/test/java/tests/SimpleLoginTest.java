package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class SimpleLoginTest extends BaseTest {






    @Test(priority = 1)
    public void testLogin() {



        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("spree@example.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("spree123");
        driver.findElement(By.name("commit")).click();


        assertTrue(driver.findElement(By.id("home-page")).isDisplayed());
    }


   @Test(priority =2)
    public void adAProductToCart() throws InterruptedException {
        driver.findElement(By.linkText("Ruby on Rails Bag")).click();
      //  driver.findElement(By.xpath("//span[@title='Ruby on Rails Bag']")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
}







 /*   private boolean assertTrue() {
        if(driver.findElement(By.className("nav-link text-white")).isDisplayed())
        {
            return true;
        }
        else{
            return false;
        }


    }*/



}