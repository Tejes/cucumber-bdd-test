package com.epam.example.stepdefs;

import static com.epam.example.stepdefs.Hooks.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.epam.example.pageobject.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Step definitions for Homepage.
 */
public class HomepageStepDefs {
    private HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    @When("^I open the (.+) page$")
    public void I_open_the_page(String url) {
        driver.get(url);
    }

    @When("^I click on the Sign in button$")
    public void I_click_on_the_sign_in_button() {
        homePage.signInButton.click();
    }

    @When("^the user enters a (.+)$")
    public void theUserEntersASearchParameter(String searchParameter) {
        homePage.searchQueryField.sendKeys(searchParameter);
    }

    @Then("^I should see the (.+) page title$")
    public void I_should_see_the_page_title(String pageTitle) {
        assertThat(homePage.mainTitle.getText(), is(equalTo(pageTitle)));
    }

    @And("^the displayed url should be (.+)$")
    public void the_url_should_be_in_the_address_bar(String expectedUrl) {
        assertThat(driver.getCurrentUrl(), is(equalTo(expectedUrl)));
    }

    @And("^the user clicks on the Search icon$")
    public void theUserClicksOnTheSearchIcon() {
        homePage.searchButton.click();
    }
}
