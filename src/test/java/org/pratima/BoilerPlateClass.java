package org.pratima;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static java.lang.Thread.sleep;

public class BoilerPlateClass
{
    public WebDriver driver;
    @BeforeMethod
    public void startBrowser()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void closeBrowser()
    {
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Thread.sleep method failed");
        }
        driver.quit();

    }



}
