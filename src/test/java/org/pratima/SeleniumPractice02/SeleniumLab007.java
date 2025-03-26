package org.pratima.SeleniumPractice02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SeleniumLab007
{

    @Test
    public void browserOptions() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--window-size=100, 80");
       // chromeOptions.addArguments("--incognito");
        //chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--headless");

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        Thread.sleep(3000);
        driver.quit();
    }

}
