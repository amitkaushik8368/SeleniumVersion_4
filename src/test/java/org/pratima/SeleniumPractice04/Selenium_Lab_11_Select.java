package org.pratima.SeleniumPractice04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pratima.BoilerPlateClass;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium_Lab_11_Select extends BoilerPlateClass
{
    @Test
    public void testSelect()
    {

        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        WebElement selectDropdown = driver.findElement(By.xpath("//div[@class = 'resp-tabs-container']//descendant::select"));
        Select select = new Select(selectDropdown);
        List<WebElement> selectOptions = select.getOptions();
        System.out.println(selectOptions.size());

        select.selectByIndex(1);





//        for (WebElement element : selectOptions)
//        {
//            System.out.println(element.getSize());
//            System.out.println(element.getText());
//            System.out.println(element.getTagName());
//        }
    }
}
