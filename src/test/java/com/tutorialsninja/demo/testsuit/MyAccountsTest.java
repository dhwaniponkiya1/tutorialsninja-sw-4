package com.tutorialsninja.demo.testsuit;

import com.tutorialsninja.demo.pages.MyAccountsPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends BaseTest {
    MyAccountsPage myAccountsPage = new MyAccountsPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.selectMyAccountOption("Register");
        String expextedText = "Register Account";
        String actualText = myAccountsPage.verifyTheTextRegisterAccount();
        Assert.assertEquals(actualText, expextedText);
    }


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.selectMyAccountOption("Login");
        String expextedText = "Returning Customer";
        String actualText = myAccountsPage.verifyTextReturningCustomer();
        Assert.assertEquals(actualText, expextedText);
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.selectMyAccountOption("Register");
        myAccountsPage.enterFirstName();                                          //Enter First Name
        myAccountsPage.enterLastName();                                           //Enter Last Name
        myAccountsPage.enterEMail();                                              //Enter Email
        myAccountsPage.enterPhoneNumber();                                          //Enter Telephone
        myAccountsPage.enterPassword();
        myAccountsPage.enterConfirmPassword();
        myAccountsPage.selectYesRadioButton();
        myAccountsPage.tickPrivacyCheckBox();
        myAccountsPage.clickContinue();
        String expextedText = "Your Account Has Been Created!";
        String actualText = myAccountsPage.accountCreationText();
        Assert.assertEquals(actualText, expextedText);
        myAccountsPage.clickingContinue();
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.selectMyAccountOption("Logout");
        expextedText = "Account Logout";
        actualText = myAccountsPage.accountLogoutText();
        Assert.assertEquals(actualText, expextedText);
        myAccountsPage.clickOnFinalContinue();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.selectMyAccountOption("Login");
        myAccountsPage.enterEmail();
        myAccountsPage.enterPassword();
        myAccountsPage.clickOnLogin();
        String expextedText = "My Account";
        String actualText = myAccountsPage.myAccountText();
        Assert.assertEquals(actualText, expextedText);
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.selectMyAccountOption("Logout");
        expextedText = "Account Logout";
        actualText = myAccountsPage.accountLogoutText();
        Assert.assertEquals(actualText, expextedText);
        myAccountsPage.clickOnFinalContinue();

    }

}
