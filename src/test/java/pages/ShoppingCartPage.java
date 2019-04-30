package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class ShoppingCartPage {

    WebDriver driver;
    WebElement product;


    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;


    }

    public int getNumberOfProducts() {
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

        }
        return product.getText();
    }

        //  System.out.println(product.getAttribute("value"));


        public ShoppingCartPage update () {


            driver.findElement(By.id("order_line_items_attributes_0_quantity")).clear();
            driver.findElement(By.id("order_line_items_attributes_0_quantity")).sendKeys("8");
            System.out.println(driver.findElement(By.id("order_line_items_attributes_0_quantity")).getText());


            return this;



        }


        public CheckOutPage clickOnCheckout(){

        driver.findElement(By.name("checkout")).click();
        return new CheckOutPage(driver);
        }

        public EmptyCartPage clickOnEmptyCart(){
        driver.findElement(By.name("commit")).click();


        return new EmptyCartPage(driver);
        }


        public boolean ifElementIsInTheCart()
        {
            return iteratingShoppingCart().trim().contains("Ruby on Rails Bag".trim());
            // return iteratingShoppingCart().trim().contains("Spree Stein".trim());

        }
    }

