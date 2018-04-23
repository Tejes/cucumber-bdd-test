package com.epam.example.stepdefs;

import static com.epam.example.stepdefs.Hooks.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.epam.example.pageobject.LoginPage;
import com.epam.example.pageobject.RegistrationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPageStepDefs {
	private LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	private RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);

	@Then("^I redirect to the registration page$")
	public void i_redirect_to_the_registration_page() throws Throwable {
	    WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOf(registrationPage.firstNameField));
	}

}
