package com.stepDefination;

import io.swagger.models.Response;
import java.nio.file.Files;
import java.nio.file.Paths;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response

public class GetEmployeeStepDefination {
	
	Response response;
	MasterStepDefinarion msd  = new MasterStepDefinarion();
	
	@When("user get employee details with valid employee name")
	public String getEmployee() throws Exception {
		response = msd.getEmployeeDetails();
	}
	
	@Then("user should see the status code")
	public void validate_getEmployee() {
		assert response.getStatusCode()==200;	  
	}
	
	@When("user get employee details with invalid employee name")
	public String getEmployee_invalid() throws Exception {
		response = msd.getEmployeeDetailsInvalid();
	}
	
	@Then("user should see the error status code")
	public void validate_getEmployee_error() {
		assert response.getStatusCode()==400;	  
	}

}
