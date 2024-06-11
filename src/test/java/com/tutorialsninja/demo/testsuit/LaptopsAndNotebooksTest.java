package com.tutorialsninja.demo.testsuit;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class LaptopsAndNotebooksTest extends BaseTest {
    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage lapAndNotePage = new LaptopsAndNotebooksPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {
        homePage.clickOn(homePage.currencyDropdown);
        homePage.clickOn(homePage.£Pound);
        homePage.mouseHoverOnElementAndClick(homePage.laptopAndNoteBookTabe);
        homePage.clickOn(homePage.showAllLaptopAndNotebook);
        List<Double> actualText = lapAndNotePage.getProductPricesInDefaultFilterAndSortByDescendingOrder();
        lapAndNotePage.select(lapAndNotePage.selectFilter, "https://tutorialsninja.com/demo/index.php?route=product/category&path=18&sort=p.price&order=DESC");
        Thread.sleep(2000);
        List<Double> expectedText = lapAndNotePage.getProductPriceAfterFilterHighToLow();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        homePage.clickOn(homePage.currencyDropdown);
        homePage.clickOn(homePage.£Pound);
        homePage.mouseHoverOnElementAndClick(homePage.laptopAndNoteBookTabe);
        homePage.clickOn(homePage.showAllLaptopAndNotebook);
        lapAndNotePage.select(lapAndNotePage.selectFilter, "https://tutorialsninja.com/demo/index.php?route=product/category&path=18&sort=p.price&order=DESC");
        lapAndNotePage.clickOn(lapAndNotePage.sonyVAIO);
        String expectedText = "Sony VAIO";
        String actualText = lapAndNotePage.getVerificationText(lapAndNotePage.sonyVAIOText);
        Assert.assertEquals(actualText, expectedText);
        lapAndNotePage.clickOn(lapAndNotePage.addToCartButton);
        expectedText = "Success: You have added Sony VAIO to your shopping cart!";
        actualText = lapAndNotePage.getVerificationText(lapAndNotePage.successText).substring(0, 56);
        Assert.assertEquals(actualText, expectedText);
        lapAndNotePage.clickOn(lapAndNotePage.shoppingCartButton);
        expectedText = "Shopping Cart";
        actualText = lapAndNotePage.getVerificationText(lapAndNotePage.shoppingCartText).substring(0, 13);
        Assert.assertEquals(actualText, expectedText);
        expectedText = "Sony VAIO";
        actualText = lapAndNotePage.setVerifyTheTextSonyVIAO();
        Assert.assertEquals(actualText, expectedText);
        lapAndNotePage.changeTheQty2();
        lapAndNotePage.clickOnUpdateButton();
        expectedText = "Success: You have modified your shopping cart!";
        actualText = lapAndNotePage.verifyUpdatedCart();
        Assert.assertEquals(actualText, expectedText);
        expectedText = "£1,472.45";
        actualText = lapAndNotePage.verifyTheTotal();
        Assert.assertEquals(actualText, expectedText);
        lapAndNotePage.clickOnCheckout();
        expectedText = "Checkout";
        actualText = lapAndNotePage.verifyTheTextCheckout();
        Assert.assertEquals(actualText, expectedText);
        expectedText = "New Customer";
        actualText = lapAndNotePage.verifyTheTextNewCustomer();
        Assert.assertEquals(actualText, expectedText);
        lapAndNotePage.clickOnGuestCheckout();
        lapAndNotePage.clickOnContinue();
        lapAndNotePage.enterFirstName();
        lapAndNotePage.enterLastName();
        lapAndNotePage.enterEmail();
        lapAndNotePage.enterTelephone();
        lapAndNotePage.enterAddress1();
        lapAndNotePage.enterCity();
        lapAndNotePage.enterPostcode();
        lapAndNotePage.enterState();
        lapAndNotePage.clickOnContinueButton();
        lapAndNotePage.enterComment();
        lapAndNotePage.clickOnContinueAfterComment();
        lapAndNotePage.clickCheckBox();
        Thread.sleep(1000);
        lapAndNotePage.setContinueClicking();
        lapAndNotePage.clickOnConfirmButton();
        expectedText = "Your order has been placed!";
        actualText = lapAndNotePage.verifyOrderPlaced();
        Assert.assertEquals(actualText, expectedText);
    }
}
