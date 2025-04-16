package org.pratima.SeleniumPractice02;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SeleniumLab008 {

    @Test
    public void vwoLogin() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        /*
        <input
            type="email"
            class="text-input W(100%)"
            name="username"
            id="login-username"
            data-qa="hocewoqisi">
         */

        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("admin@admin.com");

        /*
        <input
            type="password"
            class="text-input W(100%)"
            name="password"
            id="login-password"
            data-qa="jobodapuxe">
         */
        WebElement passField = driver.findElement(By.id("login-password"));
        passField.sendKeys("admin");


        /*
        <button
            type="submit"
            id="js-login-btn"
            class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
            onclick="login.login(event)"
            data-qa="sibequkica">
         */
        WebElement loginButton = driver.findElement(By.id("js-login-btn"));
        loginButton.click();

        Thread.sleep(3000);

        WebElement message = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(message.getText());
        File src= message.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotPath = System.getProperty("user.dir") + "/src/test/java/org/pratima/screenShots/" + "screenshot_" +timestamp+ ".png";
        File dest = new File(screenshotPath);

        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Assert.assertEquals(message.getText(), "Your email, password, IP address or location did not match");
        Thread.sleep(3000);


        driver.quit();

    }

}
