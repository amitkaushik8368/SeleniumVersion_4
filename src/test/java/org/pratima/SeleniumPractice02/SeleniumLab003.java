package org.pratima.SeleniumPractice02;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumLab003
{
    @Description("The is another program to get the page source")
    @Test
    public void pageSource_newWindow() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getPageSource());

        //Switch to new window
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bing.com");
        Thread.sleep(3000);

        //driver.close();
        driver.quit();
    }
}
