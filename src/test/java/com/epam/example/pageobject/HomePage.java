package com.epam.example.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object for Homepage.
 */
public class HomePage {
    @FindBy(tagName = "h1")
    public WebElement mainTitle;

    @FindBy(css = ".header_user_info > a")
    public WebElement signInButton;

    @FindBy(id = "search_query_top")
    public WebElement searchQueryField;

    @FindBy(css = ".button-search")
    public WebElement searchButton;
}
