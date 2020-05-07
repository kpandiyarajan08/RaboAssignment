package com.stepDefination;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.util.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.models.Response;
import io.restassured.response.Response

public class UpdateEmployeeStepDefination {
	
	Response response;
	MasterStepDefinarion msd  = new MasterStepDefinarion();
	
	@Given("get update {string} data")
	public String get_update_employee(String updateEmployeeData) throws Exception {
		String data = ""; 
		String fileName = ".//InputJSON/"+updateEmployeeData;
	    data = new String(Files.readAllBytes(Paths.get(fileName))); 
	    return data;
	}
	
	@When("user update with valid {string} data")
	public void update_employee(String updateEmployeeData) throws Exception {
		updateEmployeeData = get_update_employee(updateEmployeeData);
		response = msd.updateEmployee(updateEmployeeData);
	}
	
	@Then("user should see the status code and updated employee details")
	public void validate_updated_employee() {
		assert response.getStatusCode()==200;	  
	}
	
	@When("user update with invalid {string} data")
	public void update_employee_invalid(String updateEmployeeInvalidData) throws Exception {
		updateEmployeeInvalidData = get_update_employee(updateEmployeeInvalidData);
		response = msd.updateEmployee(updateEmployeeInvalidData);
	}
	
	@Then("user should see the error status code")
	public void validate_error_code() {
		assert response.getStatusCode()==400;	  
	}

}
