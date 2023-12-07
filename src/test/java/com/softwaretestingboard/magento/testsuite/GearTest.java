package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.*;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OverNightDuffleGearPage overNightDufflePage = new OverNightDuffleGearPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    YogaPantPage yogaPantPage = new YogaPantPage();


    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        //* Mouse Hover on Gear Menu
        bagsPage.moveToGearMenu();

        //* Click on Bags
        bagsPage.clickOnBags();

        //* Click on Product Name ‘Overnight Duffle’
        overNightDufflePage.overNightDuffleProduct();

        //* Verify the text ‘Overnight Duffle’
        overNightDufflePage.duffleMessage();

        //* Change Qty 3
        checkoutPage.qualityChangeOfDuffle("3");

        //* Click on ‘Add to Cart’ Button.
        checkoutPage.cartAdding();

        //* Verify the text 'You added Overnight Duffle to your shopping cart.'
        checkoutPage.duffleMessageToShoppingCart();

        //* Click on ‘shopping cart’ Link into message
        checkoutPage.cartShopping();

        //* Verify the product name ‘Cronus Yoga Pant’
        yogaPantPage.yogaCronusPant();

        //* Verify the Qty is ‘3’
        yogaPantPage.yogaPantQuantity();

        //* Verify the product price ‘$135.00’
        yogaPantPage.yogaPantPrice();

        //* Change Qty to ‘5’
        yogaPantPage.qualityChangeOfYogaPant("5");

        //* Click on ‘Update Shopping Cart’ button
        yogaPantPage.cartShoppingUpdated();

        //* Verify the product price ‘$225.00'
        yogaPantPage.totalPriceVerify();
            }
}
