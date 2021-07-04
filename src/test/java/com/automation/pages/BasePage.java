package com.automation.pages;

import io.cucumber.core.options.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.automation.utils.DriverUtils.getDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static com.automation.utils.ConfigUtils.getPropertyByKey;

public class BasePage {

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    int timeout = Integer.parseInt(getPropertyByKey("timeout"));
    WebDriverWait wait = new WebDriverWait(getDriver(), timeout);


    public void verifyPageTitle(String pageTitle) {
        String title = getDriver().getTitle();
        assertThat(title.contains(pageTitle))
                .as("Page title is incorrect. Expected: " + pageTitle + " " + "Actual: " + title).isEqualTo(true);
    }

    public void waitForElementToBeClickable(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForToBeVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void selectValueFromDropDown(WebElement element, String value) {
        Select option = new Select(element);
        option.selectByValue(value);
    }

    public void selectValueFromDropDownByVisibleTxt(WebElement element, String value) {
        Select option = new Select(element);
        option.selectByVisibleText(value);
    }
}
