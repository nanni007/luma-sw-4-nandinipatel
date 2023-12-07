package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
        //* Change Qty 3
        By changeQuantityOfOverNightDuffleProduct = By.xpath("//input[@id='qty']");

        public void qualityChangeOfDuffle(String str) {
                sendTextToElement(changeQuantityOfOverNightDuffleProduct, "str");
        }


        //* Click on ‘Add to Cart’ Button.
        By addToCart = By.xpath("//button[@id='product-addtocart-button']");

        public void cartAdding() {
                clickOnElement(addToCart);
        }


        //* Verify the text 'You added Overnight Duffle to your shopping cart.'
        By addedDuffleMessageToShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

        public String duffleMessageToShoppingCart() {
                return getTextFromElement(addedDuffleMessageToShoppingCart);
        }

        //* Click on ‘shopping cart’ Link into message
        By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

        public void cartShopping() {
                clickOnElement(shoppingCart);
        }


//******************************Men***************************

        //Verify the text ‘Shopping Cart.’
        By menShoppingCart = By.xpath("//span[@class='base']");

        public String shoppingCartMen() {
                return getTextFromElement(menShoppingCart);
        }

        //* Verify the product name ‘Cronus Yoga Pant’
        By verifyYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

        public String yogaPantVerify() {
                return getTextFromElement(verifyYogaPant);
        }

        //* Verify the product size ‘32’
        By verifySize32 = By.xpath("//dd[contains(text(),'32')]");

        public String size32Verify() {
                return getTextFromElement(verifySize32);
        }

        //* Verify the product colour ‘Black’
        By productColourBlack = By.xpath("//dd[contains(text(),'Black')]");

        public String colourBlackVerify() {
                return getTextFromElement(productColourBlack);
        }

}
