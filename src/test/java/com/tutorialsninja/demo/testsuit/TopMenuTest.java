package com.tutorialsninja.demo.testsuit;


import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElementAndClick(homePage.desktopTab);
        homePage.click(homePage.desktopTab, "Show AllDesktops");
        String expectedText = "Desktops";
        String actualText = homePage.getVerificationText(homePage.desktopText);
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        homePage.mouseHoverOnElementAndClick(homePage.laptopAndNoteBookTabe);
        homePage.click(homePage.desktopTab, "Show AllLaptops & Notebooks");
        String expectedText = "Laptops & Notebooks";
        String actualText = homePage.getVerificationText(homePage.laptopAndNoteBookText);
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homePage.mouseHoverOnElementAndClick(homePage.componentTab);
        homePage.click(homePage.desktopTab, "Show AllComponents");
        String expectedText = "Components";
        String actualText = homePage.getVerificationText(homePage.componentText);
        Assert.assertEquals(actualText, expectedText);
    }
}
