package com.softwaretestingboard.magento.pages;


import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BottomPantsPage extends Utility {
    //* Mouse Hover on Men Menu
    By menMenu = By.xpath("//span[normalize-space()='Men']");

    public void moveToMenMenu() {
        mouseHoverToElement(menMenu);
    }

    //* Mouse Hover on Bottoms
    By menBottoms = By.xpath("//a[@id='ui-id-18']");

    public void moveToBottoms() {
        mouseHoverToElement(menBottoms);
    }

    //* Click on Pants
    By pantsClick = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    public void clickOnPants() {
        clickOnElement(pantsClick);
    }

}
