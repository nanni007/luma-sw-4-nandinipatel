package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {

    //* Mouse Hover on Gear Menu
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");

    public void moveToGearMenu() {
        mouseHoverToElement(gearMenu);
    }


    //* Click on Bags
    By bagsClick = By.xpath("//span[normalize-space()='Bags']");

    public void clickOnBags() {
        clickOnElement(bagsClick);
    }
}

