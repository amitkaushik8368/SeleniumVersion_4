package org.pratima.SeleniumPractice04;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium_Lab_Infinite_Scroll
{
    @Test
    public void infiniteScroll() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        List<WebElement> paragraphs =  driver.findElements(By.xpath("//div[@class = 'jscroll-added']"));

        while (paragraphs.size() < 5){
            int currentCount = paragraphs.size();
            System.out.println("---------");
            System.out.println(currentCount);
            Thread.sleep(3500);
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            Thread.sleep(3500);
            System.out.println(driver.findElements(By.xpath("//div[@class = 'jscroll-added']")).size());
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(d -> d.findElements(By.xpath("//div[@class = 'jscroll-added']")).size() > currentCount);
            paragraphs = driver.findElements(By.xpath("//div[@class = 'jscroll-added']"));
        }

        Assert.assertEquals(paragraphs.size(), 5);

        driver.quit();


    }
}
