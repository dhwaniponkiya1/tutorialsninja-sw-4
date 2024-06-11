package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.By;

import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {
    public By productPrice = By.xpath("//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']//div[1]//div[2]//div[1]//p//span[@class='price-tax']");
    public By selectFilter = By.id("input-sort");
    public By sonyVAIO = By.linkText("Sony VAIO");
    public By sonyVAIOText = By.xpath("//h1[contains(text(),'Sony VAIO')]");
    public By addToCartButton = By.id("button-cart");
    public By successText = By.xpath("//div[contains(text(),'Success')]");
    public By shoppingCartButton = By.linkText("shopping cart");
    public By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By verifyTheTextSonyVIAO = By.linkText("Sony VAIO");
    By changeTheQty2 = By.xpath("//input[@class='form-control']");
    By clickOnUpdateButton = By.xpath("//i[@class='fa fa-refresh']");
    By modifiedCartText = By.xpath("//div[contains(text(),'Success')]");
    By verifyTheTotal = By.xpath("//tbody//tr//td[6]");
    By clickOnCheckout = By.xpath("//a[contains(text(),'Checkout')]");
    By verifyTheTextCheckout = By.xpath("//h1[normalize-space()='Checkout']");
    By verifyTheTxtNewCustomer = By.xpath("//h2[contains(text(),'New Customer')]");
    By clickOnGuestCheckout = By.xpath("//input[@value='guest']");
    By ClickOnContinue = By.xpath("//input[@id='button-account']");
    By firstName = By.id("input-payment-firstname");
    By lastName = By.id("input-payment-lastname");
    By eMail = By.id("input-payment-email");
    By telephone = By.id("input-payment-telephone");
    By Address1 = By.id("input-payment-address-1");
    By city = By.id("input-payment-city");
    By postcode = By.id("input-payment-postcode");
    By state = By.id("input-payment-zone");
    By clickOnCon = By.id("button-guest");
    By continueButtonAfterComment = By.id("button-shipping-method");
    By enterComment = By.name("comment");
    By tickCheckBox = By.xpath("//input[@name='agree']");
    By continueClicking = By.xpath("//input[@id='button-payment-method']");
    By orderPlacedText = By.xpath("//h1[text()='Your order has been placed!']");
    By confirmButton = By.id("button-confirm");

    public List<Double> getProductPricesInDefaultFilterAndSortByDescendingOrder() {
        return convertPriceListToReverse(productPrice);
    }

    public List<Double> getProductPriceAfterFilterHighToLow() {
        return afterFilterPrice(productPrice);
    }

    public void clearAndSendText(By by, String value) {
        driver.findElement(by).clear();
        sendTextToElement(by, value);
    }

    public String getAttribute(By by) {
        return driver.findElement(by).getAttribute("value");
    }

    public void clickOn(By by) {
        clickOnElement(by);
    }

    public String getVerificationText(By by) {
        return getTextFromElement(by);
    }

    public void select(By by, String value) {
        selectByValueFromDropDown(by, value);
    }

    public String setVerifyTheTextSonyVIAO() {
        return getTextFromElement(verifyTheTextSonyVIAO);
    }

    public void changeTheQty2() {
        driver.findElement(changeTheQty2).clear();
        sendTextToElement(changeTheQty2, "2");
    }

    public void clickOnUpdateButton() {
        clickOnElement(clickOnUpdateButton);
    }

    public String verifyUpdatedCart() {
        return getTextFromElement(modifiedCartText).substring(0, 46);
    }


    public String verifyTheTotal() {
        return getTextFromElement(verifyTheTotal);
    }

    public void clickOnCheckout() {
        clickOnElement(clickOnCheckout);
    }

    public String verifyTheTextCheckout() {
        return getTextFromElement(verifyTheTextCheckout);
    }

    public String verifyTheTextNewCustomer() {
        return getTextFromElement(verifyTheTxtNewCustomer);
    }

    public void clickOnGuestCheckout() {
        clickOnElement(clickOnGuestCheckout);
    }

    public void clickOnContinue() {
        clickOnElement(ClickOnContinue);
    }

    public void enterFirstName() {
        sendTextToElement(firstName, "Prime");
    }

    public void enterLastName() {
        sendTextToElement(lastName, "test");
    }

    public void enterEmail() {
        sendTextToElement(eMail, "pt123@gmail.com");
    }

    public void enterTelephone() {
        sendTextToElement(telephone, "07855664123");
    }

    public void enterAddress1() {
        sendTextToElement(Address1, "32 studley");
    }

    public void enterCity() {
        sendTextToElement(city, "Surat");
    }

    public void enterPostcode() {
        sendTextToElement(postcode, "865554");
    }


    public void enterState() {
        selectByValueFromDropDown(state, "3524");
    }

    public void clickOnContinueButton() {
        clickOnElement(clickOnCon);
    }

    public void enterComment() {
        sendTextToElement(enterComment, "I want a macbook");
    }

    public void clickOnContinueAfterComment() {
        clickOnElement(continueButtonAfterComment);
    }

    public void clickCheckBox() {
        clickOnElement(tickCheckBox);
    }

    public void setContinueClicking() {
        clickOnElement(continueClicking);
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }

    public String verifyOrderPlaced() {
        return getTextFromElement(orderPlacedText);
    }

}
