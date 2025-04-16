package org.pratima.SeleniumPractice04;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotWebElement
{
    @Test
    public void screenshotWebElement() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        //driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.get("https://app.vwo.com/");
        WebElement buttonElement = driver.findElement(By.id("btn-make-appointment"));
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotPath = System.getProperty("user.dir") + "/src/test/java/org/pratima/screenShots/" + "screenshot_" +timestamp+ ".png";
        File src = buttonElement.getScreenshotAs(OutputType.FILE);
        File dest = new File(screenshotPath);

        try {
            FileUtils.copyFile(src, dest);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(3000);
        driver.quit();



    }
}
