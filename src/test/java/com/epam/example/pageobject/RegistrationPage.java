package com.epam.example.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
	@FindBy(id = "customer_firstname")
    public WebElement firstNameField;
}
