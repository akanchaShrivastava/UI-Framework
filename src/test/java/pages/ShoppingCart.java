package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class ShoppingCart {

    WebDriver driver;
    WebElement product;


    public ShoppingCart(WebDriver driver) {
        this.driver = driver;


    }

    public int checkShoppingCart() {
        List<WebElement> listOfItems = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item"));

        System.out.println(listOfItems.size());
        return listOfItems.size();

    }

    public String iteratingShoppingCart() {
        List<WebElement> listOfItems = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item"));

        //  System.out.println(listOfItems.size());

        for (Iterator<WebElement> productIterator = listOfItems.iterator(); productIterator.hasNext(); ) {
             product = productIterator.next();
            System.out.println(product.getText());




            //  System.out.println(product.getAttribute("value"));

        }

        return product.getText();
    }
}
