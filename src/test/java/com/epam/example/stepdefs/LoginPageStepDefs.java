package com.epam.example.stepdefs;

import static com.epam.example.stepdefs.Hooks.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.epam.example.pageobject.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Step definitions for Login page.
 */
public class LoginPageStepDefs {
    private LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    @When("^I fill in the (.+) and (.+) credentials$")
    public void I_fill_in_the_credentials(String email, String password) {
        loginPage.emailField.sendKeys(email);
        loginPage.passwordField.sendKeys(password);
    }

    @Then("^I redirect to the login page$")
    public void I_redirect_to_the_login_page() {
        loginPage.emailField.isDisplayed();
        loginPage.passwordField.isDisplayed();
    }

    @Then("^the error message should be (.+)$")
    public void the_errormessage_should_be(String errorMessage){
        assertThat(loginPage.errorMessage.getText(), is(equalTo(errorMessage)));
    }

    @And("^click on the submit button$")
    public void click_on_the_submit_button() {
        loginPage.submitButton.click();
    }
}
