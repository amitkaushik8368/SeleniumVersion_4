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
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();

        alert.sendKeys("Amit Sharma");
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You successfully clicked an alert");
        Thread.sleep(3000);
        driver.quit();
    }
}
