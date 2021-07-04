package com.automation.stepDefs.application;

import com.automation.context.TestContext;
import com.automation.enums.Context;
import org.openqa.selenium.support.PageFactory;
import com.automation.pages.application.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import static com.automation.utils.DriverUtils.getDriver;

public class HomePageStepDefs {

    HomePage homepage = PageFactory.initElements(getDriver(), HomePage.class);
    TestContext testContext;

    public HomePageStepDefs(TestContext context) {
        testContext = context;
    }

    @When("^The user enter (.*) in search bar$")
    public void The_user_enter_text_in_search_bar(String searchText) {
        homepage.enterSearchText(searchText);
    }

    @And("^The user click on search button$")
    public void The_user_click_on_search_button() {
        homepage.clickOnSearchButton();
    }

    @And("^The user choose to buy first product$")
    public void The_user_choose_to_buy_first_product() {
        String productName = homepage.getFirstProductName();
        testContext.scenarioContext.setContext(Context.PRODUCT_NAME, productName);
    }

    @And("^The user click on add to cart button for first product$")
    public void The_user_click_on_add_to_cart_button_for_the_first_product() {
        homepage.clickOnAddToCart();
    }

    @And("^The user click on the Review & checkout Button$")
    public void The_user_click_on_review_and_checkout_button() throws InterruptedException {
        homepage.clickOnReviewButton();
    }
}
