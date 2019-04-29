package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductLisingPage {

    WebDriver driver;


    public ProductLisingPage(WebDriver driver) {
        this.driver=driver;




    }
    public AddToCartPage listOfProducts(String Category){

        driver.findElement(By.linkText(Category)).click();


return new AddToCartPage(driver);
        //System.out.println();











}


}
