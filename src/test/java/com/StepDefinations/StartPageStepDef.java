package com.StepDefinations;

import org.testng.Assert;

import com.PageObjects.StartPage;
import com.utils.BaseClass;
import com.utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StartPageStepDef extends BaseClass {

	@Given("User launch Browser and enters url {string}")
	public void user_launch_browser_and_enters_url(String url) {
		sp = new StartPage(Helper.getDriver());
		Helper.openPage(url);   
	}
	
	
	@When("User clicks on Get Started button")
	public void user_clicks_on_get_started_button() throws Exception {
		sp.clickGetStartedBtn();
	}
	
	@Then("The user  should be successfully redirected to home page")
	public void the_user_should_be_successfully_redirected_to_home_page() {
		String actualText = sp.validateHomePage();
		Assert.assertEquals(actualText, "NumpyNinja");
	}
	
	@When("The user clicks on data structure dropdown")
	public void the_user_clicks_on_data_structure_dropdown() throws Exception {
		sp.dropDownClick();
	}
	
	@Then("The user select any dropdown menu {string}")
	public void the_user_select_any_dropdown_menu(String string) throws InterruptedException {
		sp.enterDropdownValue(string);
	}
	
	@Then("It should Alert the user with the message {string}")
	public void it_should_alert_the_user_with_the_message(String string) {
		String actualText = sp.displayErrorMsg();
		Assert.assertEquals(actualText, "You are not logged in");
	}
	
   @When("The user click any of the Get started button {string} in home page")
	public void the_user_click_any_of_the_get_started_button_in_home_page(String string) throws InterruptedException {
	   sp.getStarted_home(string);
	}
	
}