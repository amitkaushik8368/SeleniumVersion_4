package org.pratima.SeleniumPractice04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumLab_03
{
    @Test
    public void testGuru99() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guru99.com/");

        WebElement testingElement = driver.findElement(By.xpath("//button[contains(@class, 'kt-blocks-accordion-header')]//span[text()='Testing']"));
        testingElement.click();
        Thread.sleep(3000);
        List<WebElement> testingList = driver.findElements(By.xpath("//div[@class='kt-accordion-panel kt-accordion-panel-active']//ul/li"));

        System.out.println(testingList.size());



        driver.quit();

    }


}