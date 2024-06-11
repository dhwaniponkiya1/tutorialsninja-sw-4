package com.tutorialsninja.demo.testsuit;

import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DesktopTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        homePage.mouseHoverOnElementAndClick(homePage.desktopTab);
        homePage.click(homePage.desktopTab, "Show AllDesktops");
        List<String> actualText = desktopPage.getProductNamesInDefaultFilterAndSortByDescendingOrder();
        desktopPage.selectFilter("https://tutorialsninja.com/demo/index.php?route=product/category&path=20&sort=pd.name&order=DESC");
        Thread.sleep(2000);
        List<String> expectedText = desktopPage.getProductNamesAfterFilterZtoA();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        homePage.clickOn(homePage.currencyDropdown);
        homePage.clickOn(homePage.£Pound);
        homePage.mouseHoverOnElement(homePage.desktopTab);
        homePage.clickOn(homePage.showAllDesktop);
        desktopPage.select(desktopPage.selectFilter, "https://tutorialsninja.com/demo/index.php?route=product/category&path=20&sort=pd.name&order=ASC");
        desktopPage.clickOn(desktopPage.hPLP3065);
        String expectedText = "HP LP3065";
        String actualText = desktopPage.getVerificationText(desktopPage.hPLP3065Text);
        Assert.assertEquals(actualText, expectedText);
        desktopPage.selectDate("2023", "November", "27");
        desktopPage.clickOn(desktopPage.addToCartButton);
        expectedText = "Success: You have added HP LP3065 to your shopping cart!";
        actualText = desktopPage.getVerificationText(desktopPage.successMessage).substring(0, 56);
        Assert.assertEquals(actualText, expectedText);
        desktopPage.clickOn(desktopPage.shoppingCartLink);
        expectedText = "Shopping Cart";
        actualText = desktopPage.getVerificationText(desktopPage.shoppingCartLinkText).substring(0, 13);
        Assert.assertEquals(actualText, expectedText);
        expectedText = "HP LP3065";
        actualText = desktopPage.getVerificationText(desktopPage.gethPLP3065Text);
        Assert.assertEquals(actualText, expectedText);
        expectedText = "Delivery Date:2023-11-27";
        actualText = desktopPage.getVerificationText(desktopPage.dateText);
        Assert.assertEquals(actualText, expectedText);
        expectedText = "Product 21";
        actualText = desktopPage.getVerificationText(desktopPage.model21Text);
        Assert.assertEquals(actualText, expectedText);
        expectedText = "£74.73";
        actualText = desktopPage.getVerificationText(desktopPage.totalAmountTxxt);
        Assert.assertEquals(actualText, expectedText);
    }

}
