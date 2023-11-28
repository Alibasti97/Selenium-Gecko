package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","\\D:\\geckodriver-v0.33.0-win64\\geckodriver.exe\\");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();

        System.out.println("Successfully Started Web Server");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("alibasti97");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Basti@000");
        password.isDisplayed();

        WebElement login = driver.findElement(By.id("login"));
        login.click();

        String text = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[1]")).getText();
        if (text.contains("Welcome")){
            System.out.println("Welcome to Adactin Group of Hotels");
        }
    }

    }
