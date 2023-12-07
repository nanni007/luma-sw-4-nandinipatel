package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class JacketsPage extends Utility {
    //* Mouse Hover on Women Menu
    By womenMenu = By.xpath("//span[normalize-space()='Women']");

    public void moveToWomenMenu() throws {
        mouseHoverToElement(womenMenu);
    }

    //* Mouse Hover on Tops
    By womenTops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    public void moveToWomenTops() {
        mouseHoverToElement(womenTops);
    }

    //* Click on Jackets
    By jacketsClick = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    public void clickOnJackets() {
        clickOnElement(jacketsClick);
    }

    //* Select Sort By filter “Product Name”
    By filterProducts = By.xpath("//select[@id='sorter'])[1]");

    public void productsFilteredByName(String text) {
        selectByVisibleTextFromDropDown(filterProducts, text);
    }

    //* Verify the products name display in alphabetical order
    By alphabeticalOrder = By.xpath("");

    public void verifyProductsAlphabeticalOrder(String text) {
        selectByVisibleTextFromDropDown(alphabeticalOrder, text);
    }
//* Select Sort By filter “Price”
    jacketsPriceElementList = getListOfElements(By.xpath("//span[@class='price-wrapper ']//span"));
    List<Double> jacketsPriceListAfter = new ArrayList<>();
Thread.sleep(1000);
        for(
    WebElement value :jacketsPriceElementList)

    {
        //Converting price in to Double and Removing $ from price
        jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));

//* Verify the products price display in Low to High


    }

}