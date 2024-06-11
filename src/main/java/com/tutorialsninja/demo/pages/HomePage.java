package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    //Locator
    public By topMenu = By.xpath("//a[@class='see-all']");
    public By desktopTab = By.xpath("//a[normalize-space()='Desktops']");
    public By laptopAndNoteBookTabe = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    public By componentTab = By.xpath("//a[normalize-space()='Components']");
    public By desktopText = By.xpath("//h2[text()='Desktops']");
    public By laptopAndNoteBookText = By.xpath("//h2[text()='Laptops & Notebooks']");
    public By componentText = By.xpath("//h2[text()='Components']");
    public By currencyDropdown = By.xpath("//span[normalize-space()='Currency']");
    public By £Pound = By.xpath("//button[normalize-space()='£Pound Sterling']");
    public By showAllDesktop = By.xpath("//a[normalize-space()='Show AllDesktops']");
    public By showAllLaptopAndNotebook = By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");

    //Mouse hover and click method
    public void mouseHoverOnElementAndClick(By by) {
        mouseHoverToElementAndClick(by);
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuElement = getMultipleElements(topMenu);
        //Store elements is webelement list
        //Click on element according to parameter
        for (WebElement e : topMenuElement) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
    }

    public void clickOn(By by) {
        clickOnElement(by);
    }

    //Mouse hover only method
    public void mouseHoverOnElement(By by) {
        mouseHoverToElement(by);
    }

    public void click(By by, String menu) {
        selectMenu(menu);
    }

    //Get text method
    public String getVerificationText(By by) {
        return getTextFromElement(by);
    }


}
