package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmptyCartPage {

    WebDriver driver;


    public EmptyCartPage(WebDriver driver) {
        this.driver=driver;






    }

    public boolean isCartEmpty(){

        return driver.findElement(By.className("alert")).isDisplayed();





    }
}


