package com.selenium.A1_seleniumInterviewEx.selenium26.webTable;

import com.selenium.A1_seleniumInterviewEx.selenium26.POMframework.TestBase_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableHandle extends TestBase_1 {

    final String TABLE = "//table[@name='BookTable']";

    // 1) Total number of rows (includes the header row)
    @Test(priority = 1)
    public void webTableHandling() {
        driver.get("https://testautomationpractice.blogspot.com/");
        int rows = driver.findElements(By.xpath(TABLE + "//tr")).size();
        System.out.println("Number of rows: " + rows);        // 7
        Assert.assertEquals(rows, 7);

        // 2) Total number of columns
        int cols = driver.findElements(By.xpath(TABLE + "//th")).size();
        System.out.println("Number of columns: " + cols);     // 4
        Assert.assertEquals(cols, 4);

// 3) Read a specific cell (5th row, 1st column)
        String bookName = driver.findElement(By.xpath(TABLE + "//tr[5]//td[1]")).getText();
        System.out.println("5th row, 1st col: " + bookName);  // Master In Selenium
        Assert.assertEquals(bookName, "Master In Selenium");

        // 4) Read all rows and columns
        // Print header
        for (int c = 1; c <= cols; c++) {
            String header = driver.findElement(By.xpath(TABLE + "//tr[1]//th[" + c + "]")).getText();
            System.out.print(header + "\t\t");
        }
        System.out.println();

        // Data rows start at 2 because row 1 is the header
        for (int r = 2; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                String value = driver.findElement(
                        By.xpath(TABLE + "//tr[" + r + "]//td[" + c + "]")).getText();
                System.out.print(value + "\t\t");
            }
            System.out.println();
        }

    }


    // 1) Total number of rows (includes the header row)
    @Test(priority = 1)
    public void countRows1() {
        int rows = driver.findElements(By.xpath(TABLE + "//tr")).size();
        System.out.println("Number of rows: " + rows);        // 7
        Assert.assertEquals(rows, 7);
    }

    // 2) Total number of columns
    @Test(priority = 2)
    public void countColumns() {
        int cols = driver.findElements(By.xpath(TABLE + "//th")).size();
        System.out.println("Number of columns: " + cols);     // 4
        Assert.assertEquals(cols, 4);
    }

    // 3) Read a specific cell (5th row, 1st column)
    @Test(priority = 3)
    public void readSpecificCell() {
        String bookName = driver.findElement(By.xpath(TABLE + "//tr[5]//td[1]")).getText();
        System.out.println("5th row, 1st col: " + bookName);  // Master In Selenium
        Assert.assertEquals(bookName, "Master In Selenium");
    }

    // 4) Read all rows and columns
    @Test(priority = 4)
    public void readAllData() {
        int rows = driver.findElements(By.xpath(TABLE + "//tr")).size();
        int cols = driver.findElements(By.xpath(TABLE + "//th")).size();

        // Print header
        for (int c = 1; c <= cols; c++) {
            String header = driver.findElement(By.xpath(TABLE + "//tr[1]//th[" + c + "]")).getText();
            System.out.print(header + "\t\t");
        }
        System.out.println();

        // Data rows start at 2 because row 1 is the header
        for (int r = 2; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                String value = driver.findElement(
                        By.xpath(TABLE + "//tr[" + r + "]//td[" + c + "]")).getText();
                System.out.print(value + "\t\t");
            }
            System.out.println();
        }
    }



    // 5) Print book names where Author = Mukesh
    @Test(priority = 5)
    public void filterByAuthor() {
        driver.get("https://testautomationpractice.blogspot.com/");

        int rows = driver.findElements(By.xpath(TABLE + "//tr")).size();

        for (int r = 2; r <= rows; r++) {
            String author = driver.findElement(By.xpath(TABLE + "//tr[" + r + "]//td[2]")).getText();
            if (author.equals("Mukesh")) {
                String book = driver.findElement(By.xpath(TABLE + "//tr[" + r + "]//td[1]")).getText();
                System.out.println("Mukesh's book: " + book);
            }
        }
    }

    // 6) Sum of all prices (4th column)
    @Test(priority = 6)
    public void sumOfPrices() {
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> prices = driver.findElements(By.xpath(TABLE + "//tr/td[4]"));
        int total = 0;
        for (WebElement p : prices) {
            total += Integer.parseInt(p.getText().trim());
        }
        System.out.println("Total price: " + total);          // 7100
        Assert.assertEquals(total, 7100);
    }
}
