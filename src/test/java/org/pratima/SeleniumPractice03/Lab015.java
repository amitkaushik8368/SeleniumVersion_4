package org.pratima.SeleniumPractice03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab015
{
    @Test
    public void handleAlerts() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(), 'JavaScript Alerts')]")).click();
        driver.findElement(By.xpath("//button[@onclick = 'jsPrompt()']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert= wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(3000);


        alert.sendKeys("Amit Sharma is an Automation Tester");
        alert.accept();
//        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: Amit Sharma is an Automation Tester");
        Thread.sleep(3000);
        driver.quit();
    }
}
