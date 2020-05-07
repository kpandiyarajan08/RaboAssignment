package com.stepDefination;

import io.swagger.models.Response;

import java.nio.file.Files;
import java.nio.file.Paths;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response


public class LogoutEmployeeStepDefinarion {
	
	Response response;
	MasterStepDefinarion msd  = new MasterStepDefinarion();
	
	@When("user logout")
	public String logout_employee() throws Exception {
		response = msd.logout();
	}
	
	@Then("user should see the status code")
	public void validate_logout() {
		assert response.getStatusCode()==200;	  
	}

}
