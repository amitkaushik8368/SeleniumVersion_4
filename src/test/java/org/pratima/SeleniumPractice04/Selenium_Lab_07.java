package org.pratima.SeleniumPractice04;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Selenium_Lab_07
{
    @Test
    public void BrokLinks() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.eddymens.com/blog/page-with-broken-pages-for-testing-53049e870421");

        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        for (WebElement anchor: list)
        {
            String hyperLink = anchor.getAttribute("href");
            try {
                URL url = new URL(hyperLink);

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                int responseCode = connection.getResponseCode();


                if (responseCode>=400)
                {
                    System.out.println("Broken Link " + hyperLink);
                } else {
                    System.out.println(hyperLink + " Status Code -> " + responseCode);
                }

            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

        Thread.sleep(3000);
        driver.quit();
    }
}
