package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDuffleGearPage extends Utility {
    //* Click on Product Name ‘Overnight Duffle’
    By overNightDuffle = By.xpath("//img[@alt='Overnight Duffle']");

    public void overNightDuffleProduct() {
        clickOnElement(overNightDuffle);
    }

    //* Verify the text ‘Overnight Duffle’
    By overNightDuffleMessage = By.xpath("//span[@class='base']");

    public String duffleMessage() {
        return getTextFromElement(overNightDuffleMessage);
    }



}