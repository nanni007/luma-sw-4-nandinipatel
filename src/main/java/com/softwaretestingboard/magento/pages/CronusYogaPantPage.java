package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class CronusYogaPantPage extends Utility {
    //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
    By clickYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");

    public void menYogaPantCLick() {
        mouseHoverToElementAndClick(clickYogaPant);
    }

    //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
    By blackColourPant = By.xpath("(//div[@class='swatch-option color'])[1]");

    public void BlackYogaPant() {
        mouseHoverToElementAndClick(blackColourPant);
    }

    //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
    By yogaPantAddToCart = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By yogaPantCartClick = By.xpath("//span[contains(text(),'Add to Cart')])[1]");

    public void hoverAndClickToCart() {
        mouseHoverToElement(yogaPantAddToCart);
        mouseHoverToElementAndClick(yogaPantCartClick);
    }

    //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    By cronusYogaPantToShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    public String yogaCronusPantShoppingCart() {
        return getTextFromElement(cronusYogaPantToShoppingCart);
    }

    //* Click on ‘shopping cart’ Link into message
    By clickOnShoppingCartYogaPant = By.xpath("//a[normalize-space()='shopping cart']");
public void yogaPantShoppingCart(){clickOnElement(clickOnShoppingCartYogaPant);}
}