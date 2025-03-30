package org.pratima.SeleniumPractice03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Lab014
{
    @Test
    public void moreOperations() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(), 'Add/Remove Elements')]")).click();
        WebElement validate = driver.findElement(By.xpath("//h3[contains(text(), 'Add/Remove Elements')]"));
        System.out.println(validate.getText());
        Assert.assertEquals(validate.getText(), "Add/Remove Elements");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //Assert.assertTrue(driver.findElement(By.cssSelector("button[class='added-manually']")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector("button[class='added-manually']")).getText());
        Assert.assertTrue(driver.findElement(By.cssSelector("button[class='added-manually']")).getText().equals("Delete"));
        for (int i = 0 ; i< 10; i++)driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        List<WebElement> deleteElements = driver.findElements(By.xpath("//button[text()='Delete']"));
        deleteElements.forEach(WebElement::click);


        //driver.quit();

    }
}
