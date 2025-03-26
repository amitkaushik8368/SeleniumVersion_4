package org.pratima.SeleniumPractice02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        //Assert.assertEquals(message.getText(), "Your email, password, IP address or location did not match");
        Thread.sleep(3000);


        driver.quit();

    }

}
