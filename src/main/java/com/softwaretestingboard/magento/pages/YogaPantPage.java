package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class YogaPantPage extends Utility {
    //* Verify the product name ‘Cronus Yoga Pant’
    By cronusYogaPant = By.xpath("//img[@alt='Cronus Yoga Pant ']");

    public String yogaCronusPant() {
        return getTextFromElement(cronusYogaPant);
    }


    //* Verify the Qty is ‘3’
    By quantityOfYogaPant = By.xpath("//span[@class='base']");

    public String yogaPantQuantity() {
        return getTextFromElement(quantityOfYogaPant);
    }


    //* Verify the product price ‘$135.00’
    By VerifyYogaPantPrice = By.xpath("//span[@class='base']");

    public String yogaPantPrice() {
        return getTextFromElement(VerifyYogaPantPrice);
    }


    //* Change Qty to ‘5’
    By changeOfYogaPantQuantity = By.xpath("(//input[@class='input-text qty'])[1]");

    public void qualityChangeOfYogaPant(String str) {
        sendTextToElement(changeOfYogaPantQuantity, "str");
    }

    //* Click on ‘Update Shopping Cart’ button
    By UpdateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    public void cartShoppingUpdated() {
        clickOnElement(UpdateShoppingCart);
    }


    //* Verify the product price ‘$225.00'
    By VerifyProductsPrice = By.xpath("//span[@class='base']");

    public String totalPriceVerify() {
        return getTextFromElement(VerifyProductsPrice);

    }

}
