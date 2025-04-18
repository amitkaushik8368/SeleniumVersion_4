package org.pratima.SeleniumPractice04;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_Lab05
{

    @Test
    public void scrollingPractice() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.geeksforgeeks.org/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 3000);");
        //js.executeScript("window.scrollBy(0, document.body.scrollHeight);");  scroll to the bottom
        Thread.sleep(2000);

        driver.quit();

    }

}
