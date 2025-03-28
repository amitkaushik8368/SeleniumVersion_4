package org.pratima.SeleniumPractice02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumLab010
{
    @Test
    public void randomAutomation() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.yardi.com/");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"masthead\"]/nav[1]/div[3]/div[1]/div[2]/ul/li[1]/a"));
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/nav[1]/div[3]/div[1]/div[2]/ul/li[1]/div/ul/li[5]/a"));
        actions.moveToElement(element).click(subMenu).build().perform();
        Thread.sleep(4000);
        driver.quit();

    }

}
