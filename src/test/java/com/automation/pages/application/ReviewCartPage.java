package com.automation.pages.application;

import com.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewCartPage extends BasePage {
    
	public ReviewCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h4.ProductName")
    private WebElement addedProductName;

    public String getAddedProductName(){
        waitForToBeVisible(addedProductName);
        return addedProductName.getText();
    }
}
