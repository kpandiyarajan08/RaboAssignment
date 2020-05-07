package com.stepDefination;

import io.swagger.models.Response;

import java.nio.file.Files;
import java.nio.file.Paths;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response

public class LoginEmployeeStepDefination {
	Response response;
	MasterStepDefinarion msd  = new MasterStepDefinarion();
	
	@When("user login with valid credentials")
	public String login_employee_valid(String employeeData) throws Exception {
		response = msd.validLogin();
	}
	
	@Then("user should see the status code")
	public void validate_login() {
		assert response.getStatusCode()==200;	  
	}
	
	@When("user login with invalid credentials")
	public String login_employee_invalid(String employeeData) throws Exception {
		response = msd.inValidLogin();
	}
	
	@Then("user should see the error status code")
	public void validate_login_error() {
		assert response.getStatusCode()==400;	  
	}

}
