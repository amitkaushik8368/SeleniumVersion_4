package org.pratima.SeleniumPractice04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pratima.BoilerPlateClass;
import org.testng.annotations.Test;

public class Selenium_Lab_10_Flipkart_2 extends BoilerPlateClass
{
    @Test

    public void testFlipkartAgain()
    {
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[@class = 'Pke_EE']")).sendKeys("Mobiles");
        driver.findElement(By.xpath("//button[contains(@class, '_2iLD_')]//*[local-name()='svg']")).click();


    }
}
