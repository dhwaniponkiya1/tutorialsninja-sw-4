package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {
    //Locator
    public By productNames = By.xpath("//div[@class='caption']//h4");
    public By selectFilter = By.id("input-sort");
    public By hPLP3065 = By.xpath("//a[normalize-space()='HP LP3065']");
    public By hPLP3065Text = By.xpath("//h1[normalize-space()='HP LP3065']");
    public By addToCartButton = By.id("button-cart");
    public By successMessage = By.xpath("//div[contains(text(),'Success')]");
    public By shoppingCartLink = By.linkText("shopping cart");
    public By shoppingCartLinkText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    public By gethPLP3065Text = By.linkText("HP LP3065");
    public By dateText = By.xpath("//small[normalize-space()='Delivery Date:2023-11-27']");
    public By model21Text = By.xpath("//td[normalize-space()='Product 21']");
    public By totalAmountTxxt = By.xpath("(//td[contains(text(),'£74.73')])[4]");

    //Convert list to descending order
    public List<String> getProductNamesInDefaultFilterAndSortByDescendingOrder() {
        return convertArrayListToReverseOrder(productNames);
    }

    //Select from drop down method
    public void selectFilter(String value) {
        selectByValueFromDropDown(selectFilter, value);
    }

    //Get list after applying filter
    public List<String> getProductNamesAfterFilterZtoA() {
        return afterFilterProductNames(productNames);
    }

    //Clear box and send text method
    public void clearAndSendText(By by, String value) {
        driver.findElement(by).clear();
        sendTextToElement(by, value);
    }

    //Get attribute method
    public String getAttribute(By by) {
        return driver.findElement(by).getAttribute("value");
    }

    public void clickOn(By by) {
        clickOnElement(by);
    }

    //Get text method
    public String getVerificationText(By by) {
        return getTextFromElement(by);
    }

    //Select from dropdown method
    public void select(By by, String value) {
        selectByValueFromDropDown(by, value);
    }

    public void selectDate(String year, String month, String date) {
        clickOnElement(By.xpath("//div[@class='input-group date']//button[@type='button']")); // Open the calendar
        while (true) {
            String monthAndYear = getTextFromElement(By.xpath("//div[@class='datepicker-days']//thead//tr[1]"));
            String[] a = monthAndYear.split(" ");
            String mon = a[1];
            String yer = a[2];
            if (mon.equals(month) && yer.equals(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'›')]"));
            }
        }
        // Select the Date
        List<WebElement> allDates = driver.findElements(By.xpath("//td[contains(@class,'day')]"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }
}

