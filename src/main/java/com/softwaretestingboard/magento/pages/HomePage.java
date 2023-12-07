package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //* Mouse Hover on Women Menu
    By womenMenu = By.xpath("(//ul[@role='menu'])[2]");

    public void moveToWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    //* Mouse Hover on Men Menu
    By menMenu = By.xpath("(//ul[@role='menu'])[5]");

    public void moveToMenMenu() {
        mouseHoverToElement(menMenu);
    }

    //* Mouse Hover on Gear Menu
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");

    public void moveToGearMenu() {
        mouseHoverToElement(gearMenu);
    }

}
