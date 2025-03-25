package org.pratima.SeleniumPractice02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class SeleniumLab005
{
    @Test
    public void validateSource() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        assertThat(driver.getPageSource()).contains("CURA Healthcare Service");
        WebElement element = driver.findElement(By.id("menu-toggle"));
        element.click();
        Thread.sleep(2000);
        driver.quit();
    }

}
