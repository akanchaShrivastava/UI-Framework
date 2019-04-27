package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.*;

public class AddingAProductToCartTest extends BaseTest {


    @Test(groups="smoke",priority = 1)
    public void adAProductToCart() throws InterruptedException {
        adAProductToCart("Ruby on Rails Bag", "https://spree-vapasi.herokuapp.com");
    }

    @Test(groups="smoke",priority = 1)
    public void adAProductToCart(String Product, String URL) throws InterruptedException {
        driver.navigate().to(URL);
        /*driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("spree@example.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("spree123");
        driver.findElement(By.name("commit")).click();*/

        driver.findElement(By.linkText(Product)).click();
        //  driver.findElement(By.xpath("//span[@title='Ruby on Rails Bag']")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        // driver.findElement(By.linkText("Ruby on Rails Bag"));
        driver.findElement(By.id("cart-detail")).findElement(By.linkText(Product));
        List<WebElement> listOfItems = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item"));
        System.out.println(listOfItems.size());
        assertTrue(listOfItems.size() == 1);

       System.out.println(listOfItems.size());

        for (Iterator<WebElement> productIterator = listOfItems.iterator(); productIterator.hasNext(); ) {
            WebElement product= productIterator.next();
           System.out.println(product.getText());
         //  System.out.println(product.getAttribute("value"));

        }

    }





}
