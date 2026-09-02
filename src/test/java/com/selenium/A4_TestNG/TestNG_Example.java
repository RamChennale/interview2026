package com.selenium.A4_TestNG;


import com.selenium.A1_seleniumInterviewEx.BaseTest_ThreadLocal;
import io.cucumber.java.After;
import org.testng.annotations.*;

public class TestNG_Example extends BaseTest_ThreadLocal {

    // Execution order priority
    // @BeforeSuite → @BeforeTest → @BeforeClass → @BeforeMethod → @Test → @AfterMethod → @AfterClass → @AfterTest → @AfterSuite

  /*1.@BeforeSuite
    2.@BeforeTest
    3.@BeforeClass
    4.@BeforeMethod
    5.@Test →
    6.@AfterMethod
    7.@AfterClass
    8.@AfterTest
    9.@AfterSuite

}*/
/*
    @BeforeSuite
    public void TestMethod0(){
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("Title of the application :executed @BeforeSuite "+ getDriver().getTitle());
        }
*/

         @BeforeTest
    public void TestMethod01(){
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("1111 BeforeTest Title of the application : executed @BeforeTest"+ getDriver().getTitle());
        System.out.println("     ");
         }

     @BeforeClass
    public void TestMethod02(){
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("2222 BeforeClass Title of the application : executed @BeforeClass "+ getDriver().getTitle());
         System.out.println("     ");
         }

     @BeforeMethod
    public void TestMethod03(){
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("3333 BeforeMethod Title of the application : executed @BeforeMethod"+ getDriver().getTitle());
         System.out.println("     ");
    }

     @Test(enabled = true, priority = 2)
    public void TestMethod04(){
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("priority = 2  @Test Title of the application : executed @Test"+ getDriver().getTitle());
         System.out.println("     ");
    }

     @AfterMethod
    public void TestMethod05(){
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("7777 AfterMethod AfterMethod Title of the application : executed @AfterMethod"+ getDriver().getTitle());
         System.out.println("     ");
    }

     @AfterClass
    public void TestMethod06(){
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("8888 AfterClass AfterClassTitle of the application : executed @AfterClass"+ getDriver().getTitle());
         System.out.println("     ");
    }

     @AfterTest
    public void TestMethod07(){
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("9999 @AfterTest Title of the application : executed @AfterTest "+ getDriver().getTitle());
         System.out.println("     ");
    }

/*     @AfterSuite
    public void TestMethod08(){
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("AfterSuite sTitle of the application : executed @AfterSuite"+ getDriver().getTitle());
    }*/

     @Test(priority=1)
    public void TestMethod09(){
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("5555 @Test(priority=1) Title of the application : executed @"+ getDriver().getTitle());
         System.out.println("     ");
    }

        @Test(priority = -1)
    public void TestMethod10(){
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("4444 @Test(priority = -1) Title of the application : executed @"+ getDriver().getTitle());
            System.out.println("     ");
    }

}
/*

OUTPUT

STARTED  @BeforeSuite
1111 BeforeTest Title of the application : executed @BeforeTestSwag Labs

2222 BeforeClass Title of the application : executed @BeforeClass Swag Labs

3333 BeforeMethod Title of the application : executed @BeforeMethodSwag Labs

4444 @Test(priority = -1) Title of the application : executed @Swag Labs

7777 AfterMethod AfterMethod Title of the application : executed @AfterMethodSwag Labs

3333 BeforeMethod Title of the application : executed @BeforeMethodSwag Labs

5555 @Test(priority=1) Title of the application : executed @Swag Labs

7777 AfterMethod AfterMethod Title of the application : executed @AfterMethodSwag Labs

3333 BeforeMethod Title of the application : executed @BeforeMethodSwag Labs

priority = 2  @Test Title of the application : executed @TestSwag Labs

7777 AfterMethod AfterMethod Title of the application : executed @AfterMethodSwag Labs

8888 AfterClass AfterClassTitle of the application : executed @AfterClassSwag Labs

9999 @AfterTest Title of the application : executed @AfterTest Swag Labs

ENDED  @AfterSuite

===============================================
Default Suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
        ===============================================


Process finished with exit code 0

*/
