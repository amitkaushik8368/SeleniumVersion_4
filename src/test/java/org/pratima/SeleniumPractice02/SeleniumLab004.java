package org.pratima.SeleniumPractice02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
import org.testng.asserts.SoftAssert;

public class SeleniumLab004
{
    // difference between asset and assertj
    @Test
    public void checkAssertions()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        assertThat(driver.getTitle()).isNotBlank().isNotNull().isEqualTo("Google");

        driver.quit();

    }
}
