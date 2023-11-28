package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMfle {

    WebDriver driver;
    public void login(){

        driver.findElement(By.id("username")).sendKeys("alibasti97");
        driver.findElement(By.id("password")).sendKeys("Basti@000");
        driver.findElement(By.id("login")).click();

    }

    public void logout(){
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
    }


}
