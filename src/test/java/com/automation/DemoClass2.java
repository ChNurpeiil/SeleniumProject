package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();// max windows

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.get("https://www.saucedemo.com");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));


        username.sendKeys("admin");
        password.sendKeys("admin123");
        loginBtn.click();
//        WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
        WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
        System.out.println(errorMsg.getText());



    }
}
