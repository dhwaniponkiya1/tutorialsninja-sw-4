package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountsPage extends Utility {

    By ClickOnMyAccountLink = By.xpath("//span[normalize-space()='My Account']");
    By registerAccountText = By.xpath("//h1[normalize-space()='Register Account']");
    By returningCustomerText = By.xpath("//h2[normalize-space()='Returning Customer']");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By emailId = By.id("input-email");
    By mobileNumber = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.name("confirm");
    By yesRadioButton = By.name("newsletter");
    By privacyPolicyCheckBox = By.name("agree");
    By clickContinue = By.xpath("//input[@value='Continue']");
    By accountCreationTextMessage = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By clickingOnContinue = By.xpath("//a[@class='btn btn-primary']");
    By clickOnLoginButton = By.xpath("//input[@value='Login']");
    By accountLogOutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    By finalContinue = By.xpath("//a[@class='btn btn-primary']");
    By myAccountText = By.xpath("//h2[normalize-space()='My Account']");

    public void selectMyAccountOption(String option) {
        clickOnElement(By.xpath("//a[normalize-space()='" + option + "']"));
    }

    public void clickOnMyAccountLink() {
        clickOnElement(ClickOnMyAccountLink);
    }

    public String verifyTheTextRegisterAccount() {
        return getTextFromElement(registerAccountText);
    }

    public String verifyTextReturningCustomer() {
        return getTextFromElement(returningCustomerText);
    }

    public void enterFirstName() {
        sendTextToElement(firstName, "Prime");
    }

    public void enterLastName() {
        sendTextToElement(lastName, "test");
    }

    public void enterEMail() {
        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);            //Create random username
        String emailID = "User" + userName + "@example.com";
        sendTextToElement(this.emailId, emailID);
    }

    public void enterPhoneNumber() {
        sendTextToElement(mobileNumber, "07424314233");
    }

    public void enterPassword() {
        sendTextToElement(password, "P@123123");
    }

    public void enterConfirmPassword() {
        sendTextToElement(confirmPassword, "P@123123");
    }

    public void selectYesRadioButton() {
        clickOnElement(yesRadioButton);
    }

    public void tickPrivacyCheckBox() {
        clickOnElement(privacyPolicyCheckBox);
    }

    public void clickContinue() {
        clickOnElement(clickContinue);
    }

    public String accountCreationText() {
        return getTextFromElement(accountCreationTextMessage);
    }

    public void clickingContinue() {
        clickOnElement(clickingOnContinue);
    }


    public String accountLogoutText() {
        return getTextFromElement(accountLogOutText);
    }

    public void clickOnFinalContinue() {
        clickOnElement(finalContinue);
    }

    public void enterEmail() {
        sendTextToElement(emailId, "ptest12@gmail.com");
    }

    public void clickOnLogin() {
        clickOnElement(clickOnLoginButton);
    }

    public String myAccountText() {
        return getTextFromElement(myAccountText);
    }

}
