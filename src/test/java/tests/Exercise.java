package tests;

import org.testng.annotations.*;

public class Exercise {

    @BeforeSuite
    public void BeforeSuiteTest() {
        System.out.println("BeforeSuiteTest");
    }

    @AfterSuite
    public void AfterSuiteTest() {
        System.out.println("AfterSuiteTest");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("AfterTest");
    }

    @BeforeMethod
    public void BeforeMethodTest() {
        System.out.println("BeforeMethodTest");

    }

    @AfterMethod
    public void AfterMethodTest() {
        System.out.println("AfterMethodTest");


    }

    @Test
    public void show1(){
        System.out.println("show1");

    }
    @Test
    public void show2(){
        System.out.println("show2");
    }
}
