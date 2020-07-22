package com.hrms.steps;

import java.io.File;

import com.hrms.tesbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoLogin extends CommonMethods{
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    BaseClass.driver.get(ConfigsReader.getProperty("url"));
	}

	@When("user enter invalid username")
	public void user_enter_invalid_username() {
	   sendText(sauceLogin.userName, "Admin");
	   wait(2);
	}

	@When("user enter invalid password")
	public void user_enter_invalid_password() {
	    sendText(sauceLogin.password, "Admin@123");
	    wait(5);
	}

	@Then("user should see the error message")
	public void user_should_see_the_error_message() {
	   click(sauceLogin.LoginBTN);
	   wait(4);
	   
	}
	
	@Then("user see the error message")
	public void user_see_the_error_message() {
	  System.err.println("Error message is displayed"); //sauceLogin.errorMEssage.getText()
	}

	@When("user enter invalid username as {string}")
	public void user_enter_invalid_username_as(String userName) {
	System.out.println(userName); 
	wait(5);
	
	}

	@When("user enter invalid password as {string}")
	public void user_enter_invalid_password_as(String password) {
	   System.out.println(password);
	   wait(5);
	}




}
