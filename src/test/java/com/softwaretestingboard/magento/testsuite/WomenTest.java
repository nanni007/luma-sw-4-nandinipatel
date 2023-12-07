package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.CheckoutPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    JacketsPage jacketsPage = new JacketsPage();
    HomePage homePage= new HomePage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
//* Mouse Hover on Women Menu
        jacketsPage.moveToWomenMenu();

//* Mouse Hover on Tops
        jacketsPage.moveToWomenTops();

//* Click on Jackets
        jacketsPage.clickOnJackets();

//* Select Sort By filter “Product Name”
        jacketsPage.productsFilteredByName();

//* Verify the products name display in alphabetical order
        jacketsPage.verifyProductsAlphabeticalOrder();
    }
    @Test
public void verifyTheSortByPriceFilter(){
//* Mouse Hover on Women Menu
homePage.moveToWomenMenu();

//* Mouse Hover on Tops
jacketsPage.moveToWomenTops();

//* Click on Jackets
jacketsPage.clickOnJackets();

//* Select Sort By filter “Price”


//* Verify the products price display in Low to High
    }
}
