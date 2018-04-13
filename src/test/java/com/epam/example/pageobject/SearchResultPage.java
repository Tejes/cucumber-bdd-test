package com.epam.example.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object for Search Result page.
 */
public class SearchResultPage {
    @FindBy(tagName = "h1")
    public WebElement mainTitle;

    @FindBy(css = ".product-container")
    public WebElement productList;
}
