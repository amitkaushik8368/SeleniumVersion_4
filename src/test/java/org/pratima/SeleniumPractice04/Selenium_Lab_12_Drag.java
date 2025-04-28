package org.pratima.SeleniumPractice04;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pratima.BoilerPlateClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_Lab_12_Drag extends BoilerPlateClass
{

    @Test
    public void dragFunctionality()
    {
        driver.get("https://www.globalsqa.com/demo-site/draggableboxes/#Simple%20Drag");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text() = 'Drag me around']//parent::div")));
        WebElement draggable = driver.findElement(By.xpath("//p[text() = 'Drag me around']//parent::div"));

        Actions actions = new Actions(driver);
        actions.clickAndHold().moveByOffset(0, 30).build().perform();



    }

}
