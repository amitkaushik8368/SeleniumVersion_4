package org.pratima.SeleniumPractice02;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
The purpose of this Lab is to do some validations on app.vwo.com website
 */
public class SeleniumLab_002
{

    @Description("This is my first allure reporting test")
    @Test
    public void urlTitleValidations() throws InterruptedException {
        //Steps to perform a test
        //1. open the browser
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        //2. navigate to the URL
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
        softAssert.assertEquals(driver.getTitle(), "Login - VWO");
        softAssert.assertAll("The following assertions have failed");
        Thread.sleep(3000);
        driver.quit();

    }


}
