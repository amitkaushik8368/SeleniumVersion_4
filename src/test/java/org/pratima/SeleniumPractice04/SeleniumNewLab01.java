package org.pratima.SeleniumPractice04;

import org.openqa.selenium.By;
import org.pratima.BoilerPlateClass;
import org.testng.annotations.Test;

public class SeleniumNewLab01 extends BoilerPlateClass
{
    @Test
    public void runSelenium()
    {
        driver.get("https://www.guru99.com/");
        driver.findElement(By.id("kt-accordion-header-835168"));

    }


}
