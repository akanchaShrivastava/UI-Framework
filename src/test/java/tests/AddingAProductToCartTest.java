package tests;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ShoppingCartPage;

import static org.testng.Assert.*;

public class AddingAProductToCartTest extends BaseTest {

    @Test(dataProvider="getInvalidProduct", groups = "smoke", priority = 1)

    public void addProductToShoppingCart(String Product) throws InterruptedException {


        LoginPage loginPage = new LoginPage(driver);

        ShoppingCartPage shoppingCartPage = loginPage.login("spree@example.com", "spree123").
                listOfProducts("Bags").addToShoppingCart(Product);
        //    assertTrue(shoppingCartPage.getNumberOfProducts() == 1);
       // assertTrue(shoppingCartPage.ifElementIsInTheCart());

        //  shoppingCartPage.update().clickOnCheckout();


        // shoppingCartPage.clickOnEmptyCart();


    }

 @DataProvider(name = "getInvalidProduct")
    public Object[][] getInvalidProduct(){


        return new Object[][]{
                {"Ruby on Rails Bag"},
                {"wallet"},
                {"bus"}

        };
    }

   @Test
    public void EmptyCart() {
        LoginPage loginPage = new LoginPage(driver);

        ShoppingCartPage shoppingCartPage = loginPage.login("spree@example.com", "spree123").
                listOfProducts("Bags").
                addToShoppingCart("Ruby on Rails Bag");
        shoppingCartPage.clickOnEmptyCart().isCartEmpty();


    }


    @Test()
    public void updateCart() {


        LoginPage loginPage = new LoginPage(driver);

        ShoppingCartPage shoppingCartPage = loginPage.login("spree@example.com", "spree123").
                listOfProducts("Bags").
                addToShoppingCart("Ruby on Rails Bag");
        //   assertTrue(shoppingCartPage.getNumberOfProducts() == 1);
        assertTrue(shoppingCartPage.ifElementIsInTheCart());

        shoppingCartPage.update();


    }


    @Test()
    public void checkoutCart() {

        LoginPage loginPage = new LoginPage(driver);

        ShoppingCartPage shoppingCartPage = loginPage.login("spree@example.com", "spree123").
                listOfProducts("Bags").
                addToShoppingCart("Ruby on Rails Bag");


        shoppingCartPage.clickOnCheckout();
    }


}











