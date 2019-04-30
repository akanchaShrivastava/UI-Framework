package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
    WebDriver driver;


    public AddToCartPage(WebDriver driver) {
        this.driver = driver;


    }

    public ShoppingCartPage addToShoppingCart(String Product) {
        System.out.println(Product);
        driver.findElement(By.linkText(Product.trim())).click();
         // driver.findElement(By.xpath("//span[@title='Product']")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        // driver.findElement(By.linkText("Ruby on Rails Bag"));

        return new ShoppingCartPage(driver);

    }
}
