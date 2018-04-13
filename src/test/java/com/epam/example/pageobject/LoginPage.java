package com.epam.example.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object for Login page.
 */
public class LoginPage {
    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "passwd")
    public WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    public WebElement submitButton;

    @FindBy(css = ".alert > ol > li")
    public WebElement errorMessage;
}
