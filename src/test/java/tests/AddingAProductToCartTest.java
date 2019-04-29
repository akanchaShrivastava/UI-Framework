package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ProductLisingPage;
import pages.LoginPage;
import pages.ShoppingCart;

import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.*;

public class AddingAProductToCartTest extends BaseTest {

    @Test(groups = "smoke", priority = 1)

    public void addProductToShoppingCart() throws InterruptedException {


        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("spree@example.com", "spree123");

        ProductLisingPage pListing = new ProductLisingPage(driver);
        pListing.addToShoppingCart();

        ShoppingCart sCart = new ShoppingCart(driver);

        assertTrue(sCart.checkShoppingCart() == 1);
        assertTrue(sCart.iteratingShoppingCart().trim().contains("Ruby on Rails Bag".trim()));
    }
}






