package com.stepDefination;

import io.swagger.models.Response;
import java.nio.file.Files;
import java.nio.file.Paths;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response

public class DeleteEmployeeStepDefination {
	
	Response response;
	MasterStepDefinarion msd  = new MasterStepDefinarion();
	
	@When("user delete employee details with valid employee name")
	public String deleteEmployee() throws Exception {
		response = msd.deleteEmployeeDetails();
	}
	
	@Then("user should see the status code")
	public void validate_deleteEmployee() {
		assert response.getStatusCode()==204;	  
	}
	
	@When("user delete employee details with invalid employee name")
	public String deleteEmployee_invalid() throws Exception {
		response = msd.deleteEmployeeDetailsInvalid();
	}
	
	@Then("user should see the error status code")
	public void validate_deleteEmployee_error() {
		assert response.getStatusCode()==400;	  
	}

}
