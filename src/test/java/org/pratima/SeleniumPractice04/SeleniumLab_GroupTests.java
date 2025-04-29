package org.pratima.SeleniumPractice04;

import org.testng.annotations.Test;

public class SeleniumLab_GroupTests
{
    @Test(groups = "Tallyman")
    public void unsecuredLending()
    {
        System.out.println("I am Testing Tallyman Loans");
    }
    @Test(groups = "Tallyman")
    public void securedLending()
    {
        System.out.println("I am testing Tallyman mortgages");
    }
    @Test(groups = "Tallyman")
    public void businessLending()
    {
        System.out.println("I am testing Business Banking Tallyman");
    }

    @Test(groups = "DM")
    public void cardsLending()
    {
        System.out.println("I am testing Debt Manager Cards");
    }

    @Test(groups = "DM")
    public void allLending()
    {
        System.out.println("I am testing all lending through DM11");
    }

}
