package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductLisingPage {

    WebDriver driver;


    public ProductLisingPage(WebDriver driver) {
        this.driver=driver;




    }
    public void listOfProducts(){

        driver.findElement(By.linkText("Bags")).click();
        List<WebElement> list=
        //System.out.println();











}


}
