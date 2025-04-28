package org.pratima.SeleniumPractice04;

import org.testng.annotations.*;

public class SeleniumLab_12_TestNG_2
{
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("I am executed before Suite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("I am executed before Test");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("I am executed before Class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("I am execute before method");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("I am executed after Suite");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("I am executed after Test");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("I am executed after Class");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("I am execute after method");
    }


    @Test
    public void masterTestNG()
    {
        System.out.println("Inside Only Test Method in TestNG_2 class");
    }

}
