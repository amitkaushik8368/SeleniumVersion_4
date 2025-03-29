package org.pratima.SeleniumPractice03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumLab011
{
    @Test
    public void xPathPractice() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");
        WebElement emailKeys = driver.findElement(By.xpath("//input[@id = 'login-username']"));
        emailKeys.sendKeys("admin@admin.com");

        WebElement sendPass = driver.findElement(By.xpath("//input[@name= 'password']"));
        sendPass.sendKeys("1234567");

        WebElement button = driver.findElement(By.xpath("//button[@id= 'js-login-btn']"));

        button.click();


        Thread.sleep(3000);
        driver.quit();
    }


}
