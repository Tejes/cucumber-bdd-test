package com.epam.example.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object for Account page.
 */
public class AccountPage {
    @FindBy(css = ".info-account")
    public WebElement accountTitle;
}
