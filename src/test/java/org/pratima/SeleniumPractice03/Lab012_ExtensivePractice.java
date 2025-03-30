package org.pratima.SeleniumPractice03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.Test;

public class Lab012_ExtensivePractice
{
    @Test
    public void extensivePractice() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        EdgeDriver driver = new EdgeDriver(edgeOptions);

        if (driver.getSessionId()!=null)
            System.out.println("Browser is up and running");
        else System.out.println("Browser is closed");
        Thread.sleep(4000);

        //driver.quit();

        driver.close();


//        try{
//            if (driver.getSessionId()!=null)
//                System.out.println("Browser is up and running");
//            else System.out.println("Browser is closed");
//        }catch (RuntimeException e) {
//            System.out.println("There is an exception");
//        }



    }
}
