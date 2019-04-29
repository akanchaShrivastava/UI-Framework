package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductLisingPage {


        WebDriver driver;


    public ProductLisingPage(WebDriver driver) {
            this.driver=driver;


        }
    public void addToShoppingCart(){
        driver.findElement(By.linkText("Ruby on Rails Bag")).click();
        //  driver.findElement(By.xpath("//span[@title='Ruby on Rails Bag']")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        // driver.findElement(By.linkText("Ruby on Rails Bag"));




    }


}
