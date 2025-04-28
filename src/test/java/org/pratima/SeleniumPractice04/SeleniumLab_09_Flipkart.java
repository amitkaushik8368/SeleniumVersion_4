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

        WebElement loginPopup = driver.findElement(By.xpath("//div[@class = '_39Ul0t']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOf(loginPopup));

        WebElement hoverElement = driver.findElement(By.xpath("//div[@class = 'zlQd20 _1eDlvI']//child::img[1]"));

        Actions actions = new Actions(driver);

        actions.perform();
        actions.moveToElement(hoverElement).perform();


    }
}
