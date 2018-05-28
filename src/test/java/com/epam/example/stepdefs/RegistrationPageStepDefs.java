package com.epam.example.stepdefs;

import static com.epam.example.stepdefs.Hooks.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import com.epam.example.pageobject.LoginPage;
import com.epam.example.pageobject.RegistrationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPageStepDefs {
	//private LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	private RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);

	@Then("^I redirect to the registration page$")
	public void i_redirect_to_the_registration_page() throws Throwable {
	    WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOf(registrationPage.firstNameField));
	}
	
	@When("^I enter \"(.*?)\" into the first name field$")
	public void i_enter_into_the_first_name_field(String name) {
		registrationPage.firstNameField.sendKeys(name);
	}
	
	@And("^I enter \"(.*?)\" into the last name field$")
	public void i_enter_into_the_last_name_field(String name) {
		registrationPage.lastNameField.sendKeys(name);
	}
	
	@And("^I enter \"(.*?)\" into the password field$")
	public void i_enter_into_the_password_field(String name) {
		registrationPage.passwordField.sendKeys(name);
	}

	@And("^I enter \"(.*?)\" into the address field$")
	public void i_enter_into_the_address_field(String name) {
		registrationPage.addressField.sendKeys(name);
	}
	
	@And("^I enter \"(.*?)\" into the city field$")
	public void i_enter_into_the_city_field(String name) {
		registrationPage.cityField.sendKeys(name);
	}
	
	@And("^I choose \"(.*?)\" from the states select$")
	public void i_choose_from_the_states_select(String name) {
//		registrationPage.stateSelect.click();
//		List<WebElement> options = registrationPage.stateSelect.findElements(By.tagName("option"));
//		for (WebElement element : options) {
//			if (element.getText().equals(name)) {
//				element.click();
//				break;
//			}
//		}
		new Select(registrationPage.stateSelect).selectByVisibleText(name);
	}
	
	@And("^I enter \"(.*?)\" into the postcode field$")
	public void i_enter_into_the_postcode_field(String name) {
		registrationPage.postCodeField.sendKeys(name);
	}
	
	@And("^I choose \"(.*?)\" from the countries select$")
	public void i_choose_from_the_countries_select(String name) {
		new Select(registrationPage.countrySelect).selectByVisibleText(name);
	}
	
	@And("^I enter \"(.*?)\" into the mobile phone field$")
	public void i_enter_into_the_mobile_phone_field(String name) {
		registrationPage.mobilePhoneField.sendKeys(name);
	}
	
	@And("^I click the submit button$")
	public void i_click_the_submit_button() {
		registrationPage.submitButton.click();
	}
}
