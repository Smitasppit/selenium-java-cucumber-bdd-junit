package com.automation.stepDefs;

import com.automation.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static com.automation.utils.DriverUtils.getDriver;

public class GenericStepDefs {

    BasePage basePage = new BasePage(getDriver());

    @When("^The title of the page is displayed as (.*)$")
    public void The_title_of_the_page_is_displayed(String pageTitle) throws InterruptedException {
        basePage.verifyPageTitle(pageTitle);
    }
}
