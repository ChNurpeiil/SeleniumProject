package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoHome {
    public static void main(String[] args) {
//        =========Homework 23 May ===========
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //1. open website
        driver.get("https://www.saucedemo.com/");

        //2. Login with Valid Credentials & Navigates to the homepage
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginBtn.click();

        //3. Click on add to cart button of the first item

        WebElement item1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        item1.click();

        //4. Click on the cart icon and navigates to the cart page
        WebElement shCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        shCart.click();

        //5. Click on the checkout button
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        //6. Fill in all the required details on the checkout page
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement postalCode = driver.findElement(By.id("postal-code"));

        firstName.sendKeys("Nurpeiil");
        lastName.sendKeys("Ashibaeva");
        postalCode.sendKeys("720005");

        //7. Click on the Continue button and navigates to the review order page
        WebElement continueBtn = driver.findElement(By.id("continue"));
        continueBtn.click();

        //8. Print the total amount from the review order page into the output
        WebElement total = driver.findElement(By.xpath("//div[contains(@class, ' summary_total_label')]"));
        System.out.println(total.getText());

        //9. Click on the Finish button
        WebElement finishBtn = driver.findElement(By.id("finish"));
        finishBtn.click();


        //10. Print confirmation message in the output
        WebElement confirmation = driver.findElement(By.id("checkout_complete_container"));
        System.out.println(confirmation.getText());



    }
}
