package com.stepDefination;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.util.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.models.Response;
import io.restassured.response.Response

public class CreateEmployeeStepDefination {
	Response response;
	MasterStepDefinarion msd  = new MasterStepDefinarion();
	
	@Given("get {string} data")
	public String get_employee_data(String employeeData) throws Exception {
		String data = ""; 
		String fileName = ".//InputJSON/"+employeeData;
	    data = new String(Files.readAllBytes(Paths.get(fileName))); 
	    return data;
	}
	
	@When("user create employee with {string} data")
	public void create_employee(String employeeData) throws Exception {
		employeeData = get_employee_data(employeeData);
		response = msd.createEmployee(employeeData);
		
	}
	
	@Then("user should see the status code and created employee details")
	public void validate_created_employee() {
		assert response.getStatusCode()==201;	  
	}
	
	@Then("user should see the error code and message")
	public void validate_error_code() {
		assert response.getStatusCode()==400;	  
	}
	
	@When("user create multiple employee with {string} data")
	public void create_multiple_employee(String employeeData) throws Exception {
		employeeData = get_employee_data(employeeData);
		response = msd.createMultipleEmployees(employeeData);
		
	}

}
