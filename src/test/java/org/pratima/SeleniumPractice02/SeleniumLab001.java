package org.pratima.SeleniumPractice02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumLab001
{
    @Test
    void launchNaukri() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        WebDriver driver1 = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.naukri.com");

        Thread.sleep(3000);

        WebElement loginNaukri = driver.findElement(By.id("login_Layer"));
        loginNaukri.click();

        //WebElement enterEmail = driver.findElement(By.className("err-border"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the element to be visible
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")));
        //WebElement element = driver.findElement(By.xpath("//*[contains(@id, 'loginButton')]"));
        WebElement enterEmail = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input"));
        enterEmail.sendKeys("amit.kaushik9466@gmail.com");
        Thread.sleep(5000);
        driver.quit();
        //driver.quit();
    }

}
