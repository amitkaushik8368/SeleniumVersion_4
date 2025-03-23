package org.pratima.SeleniumPractice01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchBrowser01
{
    @Test
    public void runTheTest() throws InterruptedException {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.linkedin.com/in/amit-sharma-qa/");
        System.out.println(chromeDriver.getTitle());
        Thread.sleep(7000);
        Assert.assertEquals(chromeDriver.getTitle(), "Sign Up | LinkedIn");
        chromeDriver.quit();
    }

}
