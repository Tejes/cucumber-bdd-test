package com.epam.example.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	@FindBy(id = "customer_firstname")
    public WebElement firstNameField;
	
	@FindBy(id = "customer_lastname")
    public WebElement lastNameField;
	
	@FindBy(id = "email")
    public WebElement emailField;
	
	@FindBy(id = "passwd")
    public WebElement passwordField;
	
	@FindBy(id = "address1")
    public WebElement addressField;
	
	@FindBy(id = "city")
    public WebElement cityField;
	
	@FindBy(id = "id_state")
    public WebElement stateSelect;
	
	@FindBy(id = "postcode")
    public WebElement postCodeField;
	
	@FindBy(id = "id_country")
	public WebElement countrySelect;
	
	@FindBy(id = "phone_mobile")
    public WebElement mobilePhoneField;
	
	@FindBy(id = "submitAccount")
    public WebElement submitButton;
}
