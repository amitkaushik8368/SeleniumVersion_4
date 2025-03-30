package org.pratima.SeleniumPractice03;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lab013_Close_Quit
{
    @Test
    public void closeQuitBrowser()
    {
//        EdgeOptions options = new EdgeOptions();
//        options.addArguments("--start-maximized");
        EdgeDriver driver = new EdgeDriver();
        if (driver.getSessionId() != null)
            System.out.println("Browser is Running");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.close();



    }
}
