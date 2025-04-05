package org.pratima.SeleniumPractice04;

import org.pratima.BoilerPlateClass;
import org.testng.annotations.Test;

public class SeleniumNewLab01 extends BoilerPlateClass
{
    @Test
    public void runSelenium()
    {
        driver.get("https://www.guru99.com/");
    }
}
