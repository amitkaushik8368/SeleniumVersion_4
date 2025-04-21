package org.pratima.SeleniumPractice04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pratima.BoilerPlateClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumLab_09_Flipkart extends BoilerPlateClass
{
    @Test
    public void testFlipkart()
    {


        driver.get("https://www.flipkart.com/");
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = '_1wE2Px']")));
        WebElement hoverElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = '_1wE2Px']")));
        WebElement insideHover = driver.findElement(By.xpath("//a[@class = '_1BJVlg _11MZbx']"));
        WebElement clickElement = driver.findElement(By.xpath("//a[contains(text(), 'Women Heels')]"));


        Actions actions = new Actions(driver);

        actions.moveToElement(hoverElement).moveToElement(insideHover).click(clickElement).build().perform();


    }
}
