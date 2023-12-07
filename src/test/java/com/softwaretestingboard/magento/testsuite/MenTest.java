package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BottomPantsPage;
import com.softwaretestingboard.magento.pages.CheckoutPage;
import com.softwaretestingboard.magento.pages.CronusYogaPantPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    CronusYogaPantPage cronusYogaPantPage = new CronusYogaPantPage();
    BottomPantsPage bottomPantsPage = new BottomPantsPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
//* Mouse Hover on Men Menu
        bottomPantsPage.moveToMenMenu();
//* Mouse Hover on Bottoms
        bottomPantsPage.moveToBottoms();
//* Click on Pants
        bottomPantsPage.clickOnPants();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        cronusYogaPantPage.menYogaPantCLick();

        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        cronusYogaPantPage.BlackYogaPant();

        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        cronusYogaPantPage.hoverAndClickToCart();

        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        cronusYogaPantPage.yogaCronusPantShoppingCart();

        //* Click on ‘shopping cart’ Link into message
        cronusYogaPantPage.yogaPantShoppingCart();

        //* Verify the text ‘Shopping Cart.’
        checkoutPage.shoppingCartMen();

        //* Verify the product name ‘Cronus Yoga Pant’
        checkoutPage.yogaPantVerify();

        //* Verify the product size ‘32’
        checkoutPage.size32Verify();

        //* Verify the product colour ‘Black’
        checkoutPage.colourBlackVerify();
    }
}
