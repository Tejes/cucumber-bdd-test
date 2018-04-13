package com.epam.example.stepdefs;

import static com.epam.example.stepdefs.Hooks.driver;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.epam.example.pageobject.AccountPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Step definitions for Account page.
 */
public class AccountPageStepDefs {
    private AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);

    @Then("^the account title should be (.+)$")
    public void the_account_title_should_be(String accountTitle) {
        assertThat(accountPage.accountTitle.getText(), is(containsString(accountTitle)));
    }
}
