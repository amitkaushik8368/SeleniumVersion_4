package org.pratima.SeleniumPractice04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

public class SeleniumLab_10_Navigate_Get
{
    @Test
    public void testNavigate()      {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        //driver.get("https://www.flipkart.com/");
        driver.navigate().to("https://www.flipkart.com/");


    }

}
