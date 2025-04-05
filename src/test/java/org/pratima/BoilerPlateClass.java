package org.pratima;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static java.lang.Thread.sleep;

public class BoilerPlateClass
{
    public WebDriver driver;
    @BeforeTest
    public void startBrowser()
    {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        driver = new EdgeDriver(options);
    }

    @AfterTest
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
