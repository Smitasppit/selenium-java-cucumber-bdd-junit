package com.automation.pages.application;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.automation.pages.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "input[name='q']")
	private  WebElement searchBar;

	@FindBy(css = "button[aria-label='search'")
	private  WebElement searchButton;

	@FindBy(css = ".SearchComponentstyle__SearchComponentWrapper-sc-1l60lhw-11.SearchComponentstyle__SearchComponentWrapper-sc-1l60lhw-11.SearchComponentstyle__SearchComponentWrapper-sc-1l60lhw-11.SearchComponentstyle__SearchComponentWrapper-sc-1l60lhw-11")
	private  WebElement searchResults;

	@FindBy(css = "button[data-locator='atcButton']")
	private  List<WebElement> addToCartButtons;

	@FindBy(xpath = "//*[@id=\"__next\"]/main/div/div[3]/div/div[4]/article[1]/a/div[2]/div[2]/a/p")
	private WebElement firstProduct;

	public String firstProductName="";
	@FindBy(css = ".reviewBtn")
	private WebElement reviewButton;

	public void enterSearchText(String searchText) {
		searchBar.clear();
		searchBar.sendKeys(searchText);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public void clickOnAddToCart() {
		waitForToBeVisible(searchResults);
		waitForElementToBeClickable(addToCartButtons.get(0));
		addToCartButtons.get(0).click();
	}
	public void clickOnReviewButton() {
		waitForToBeVisible(reviewButton);
		reviewButton.click();
	}

	public String getFirstProductName(){
		waitForToBeVisible(firstProduct);
		return firstProduct.getText();
	}


}
