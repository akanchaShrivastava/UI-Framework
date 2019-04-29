package tests;


import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.ProductLisingPage;
import pages.LoginPage;
import pages.ShoppingCartPage;

import static org.testng.Assert.*;

public class AddingAProductToCartTest extends BaseTest {

    @Test(groups = "smoke", priority = 1)

    public void addProductToShoppingCart() throws InterruptedException {


        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("spree@example.com", "spree123");

        ProductLisingPage pListing = new ProductLisingPage(driver);
        pListing.listOfProducts();

        AddToCartPage addToCartPage=new AddToCartPage(driver);
        addToCartPage.addToShoppingCart("Ruby on Rails Bag");

        ShoppingCartPage sCart = new ShoppingCartPage(driver);

      //  assertTrue(sCart.checkShoppingCart() == 1);
        assertTrue(sCart.ifElementIsInTheCart());
    }
}






