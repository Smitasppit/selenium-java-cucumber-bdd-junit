package com.automation.stepDefs.application;

import com.automation.context.TestContext;
import com.automation.enums.Context;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import com.automation.pages.application.ReviewCartPage;
import io.cucumber.java.en.And;
import static com.automation.utils.DriverUtils.getDriver;

public class ReviewCartPageStepDefs {
    
	ReviewCartPage reviewCartPage = PageFactory.initElements(getDriver(), ReviewCartPage.class);
    TestContext testContext;

    public ReviewCartPageStepDefs(TestContext context) {
        testContext = context;
    }

    @And("^The user verifies added item is on Review cart page$")
    public void The_user_verifies_added_item_is_on_review_cart_page() {
        String productName = (String)testContext.scenarioContext.getContext(Context.PRODUCT_NAME);
        Assert.assertEquals(reviewCartPage.getAddedProductName(),productName);
    }
}
