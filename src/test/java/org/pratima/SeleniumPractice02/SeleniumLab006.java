package org.pratima.SeleniumPractice02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumLab006
{
    @Test
    public void navigateCommands() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement gmail = driver.findElement(By.className("gb_X"));
        gmail.click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.quit();

//        WebElement button = driver.findElement(By.xpath("//*[@id=\"ERWdKc\"]/div[1]/span"));
//        button.click();
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        Thread.sleep(1000);
//        driver.quit();

    }
}
