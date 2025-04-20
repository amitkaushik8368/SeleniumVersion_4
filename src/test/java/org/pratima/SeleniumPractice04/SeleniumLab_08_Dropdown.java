package org.pratima.SeleniumPractice04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pratima.BoilerPlateClass;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumLab_08_Dropdown extends BoilerPlateClass
{
    @Test
    public void handleDropdown() throws InterruptedException {

        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        List<WebElement> selectOptions = driver.findElements(By.xpath("//select/option"));
        System.out.println(selectOptions.size());

        WebElement element = driver.findElement(By.xpath("//select"));
        Select select = new Select(element);
        select.selectByIndex(248);
        Thread.sleep(2000);
        select.selectByValue("IND");
        Thread.sleep(2000);
        select.selectByVisibleText("Guatemala");
        Thread.sleep(2000);
        System.out.println(select.getFirstSelectedOption());
        select.selectByContainsVisibleText("hin");


        for (WebElement selectOption : selectOptions)
        {
            //Select select = new Select(selectOption);
            //select.selectByValue();
            //System.out.println(selectOption.getText());
            //System.out.println(selectOption.getAttribute("value"));
        }

    }

}
