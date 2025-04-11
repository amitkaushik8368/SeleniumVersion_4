package org.pratima.SeleniumPractice04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pratima.SeleniumPractice02.SeleniumLab009;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SeleniumLab_02
{
    @Test
    public void windowSwitch()
    {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement newTabLink = driver.findElement(By.xpath("//a[text()='Click Here']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(newTabLink));

        String parentHandle = driver.getWindowHandle();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).click(newTabLink).keyUp(Keys.SHIFT).build().perform();

        Select select = new Select(newTabLink);
       // select.




        Set<String> allWindows = driver.getWindowHandles();

        for (String s : allWindows)
        {
            if (!s.equals(parentHandle))
            {
                driver.switchTo().window(s);
            }
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            driver.close();
        }


    }
}
