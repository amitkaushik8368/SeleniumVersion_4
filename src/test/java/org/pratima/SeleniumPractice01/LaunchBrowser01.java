package org.pratima.SeleniumPractice01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser01
{
    @Test
    public void runTheTest() {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.linkedin.com/in/amit-sharma-qa/");
        System.out.println(chromeDriver.getTitle());
        chromeDriver.quit();
    }

}
