package org.pratima.SeleniumPractice04;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SeleniumLab_04_Screenshot
{
    @Test
    public void screenshotTest() throws IOException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        //driver.get("https://katalon-demo-cura.herokuapp.com/");
        //driver.get("https://app.vwo.com");
        System.out.println(System.getProperty("user.dir") + "/src/test/java/org/pratima/screenShots");

//        LocalTime localTime = LocalTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH_mm_ss");
//
//        String timestamp = localTime.format(formatter);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        System.out.println("Temporary path: " + src.getAbsolutePath());
        File dest = new File(System.getProperty("user.dir") + "/src/test/java/org/pratima/screenShots/" + "screenshot_" +timestamp+ ".png");
        FileUtils.copyFile(src, dest);

        driver.quit();
    }
}
