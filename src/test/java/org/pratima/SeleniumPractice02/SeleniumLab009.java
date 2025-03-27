package org.pratima.SeleniumPractice02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumLab009
{
    @Test
    public void loginTest() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeAppoint = driver.findElement(By.id("btn-make-appointment"));
        makeAppoint.click();
        Thread.sleep(3000);
        WebElement uname = driver.findElement(By.name("username"));
        uname.sendKeys("John Doe");
        WebElement pass = driver.findElement(By.id("txt-password"));
        pass.sendKeys("ThisIsNotAPassword");
        WebElement submit = driver.findElement(By.id("btn-login"));
        submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");

        Thread.sleep(5000);

        driver.quit();
    }

}
