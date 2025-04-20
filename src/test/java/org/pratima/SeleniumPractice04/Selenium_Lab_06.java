package org.pratima.SeleniumPractice04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium_Lab_06
{
    @Test
    public void brokenLinks() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://stackoverflow.com/questions");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
        WebElement element = driver.findElement(By.id("onetrust-accept-btn-handler"));

        element.click();

        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        for (WebElement anchor : list)
        {
            System.out.println(anchor.getAttribute("href"));
        }

        Thread.sleep(4000);



        driver.quit();


    }
}
