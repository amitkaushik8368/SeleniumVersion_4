package org.pratima.SeleniumPractice03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab016_Actions
{
    @Test
    public void validateActions() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(options);

        driver.get("https://www.amazon.in/");
        WebElement prime = driver.findElement(By.xpath("//span[text() = 'Prime']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(prime).perform();
        Thread.sleep(3000);

        driver.quit();

    }
}
