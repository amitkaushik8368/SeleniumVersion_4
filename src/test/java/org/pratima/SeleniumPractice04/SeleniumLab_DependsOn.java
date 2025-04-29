package org.pratima.SeleniumPractice04;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumLab_DependsOn
{


    @Test
    public void tallyman()
    {
        System.out.println("Inside First test method");
        Assert.fail();
    }

    @Test(dependsOnMethods = "tallyman")
    public void sdm()
    {
        System.out.println("Inside second test method");
    }

    @Test
    public void recoveries()
    {
        System.out.println("This is third method");
    }

}
