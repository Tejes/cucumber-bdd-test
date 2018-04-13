package com.epam.example.stepdefs;

import static com.epam.example.stepdefs.Hooks.driver;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.epam.example.pageobject.SearchResultPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Step definitions for Search Result page.
 */
public class SearchResultPageStepDefs {
    private SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);

    @Then("^the user will be navigated to the (.+) Search Results Page$")
    public void theUserWillBeNavigatedToTheSearchResultsPage(String searchParameter){
        assertThat(searchResultPage.mainTitle.getText(), is(containsString(searchParameter.toUpperCase())));
    }

    @Then("^the elements in the list will reflects to the (.+)$")
    public void theElementsInTheListWillReflectsToTheSearchParameter(String searchParameter) {
        assertThat(searchResultPage.productList.getText(), is(containsString(searchParameter)));
    }
}
