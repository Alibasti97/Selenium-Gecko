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

        // Login Code

        POMfle loginitem = new POMfle();
        loginitem.login(driver);

    // Verfication
        String text = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[1]")).getText();
        if (text.contains("Welcome")){
            System.out.println("Welcome to Adactin Group of Hotels");
        }
        // Logout Code

        POMfle logoutitem = new POMfle();
        logoutitem.logout(driver);

        // Verfication

        String text1 = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr")).getText();
        if (text1.contains("logged out")){
            System.out.println("User has successfully Logged Out");
        }
    }

    }
