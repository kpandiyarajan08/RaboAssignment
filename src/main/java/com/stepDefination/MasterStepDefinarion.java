package com.stepDefination;

import io.restassured.response.Response;
import io.swagger.models.Response;


public class MasterStepDefinarion {
	public Response  createEmployee(String payload) {
		   return given().headers().body(payload.toJson()).when()

                   .post(getUrl("createEmployee"));
		
	}
	
	public Response  createMultipleEmployees(String payload) {
		   return given().headers().body(payload.toJson()).when()

                .post(getUrl("createMultipleEmployees"));
		
	}

	public Response validLogin() {
		return given().headers().get(getUrl("validLogin"));
		
	}
	
	public Response inValidLogin() {
		return given().headers().get(getUrl("inValidLogin"));
		
	}
	
	public Response logout() {
		return given().headers().get(getUrl("logout"));
		
	}
	
	public Response getEmployeeDetails() {
		return given().headers().get(getUrl("getEmployeeDetails"));
		
	}
	
	public Response getEmployeeDetailsInvalid() {
		return given().headers().get(getUrl("getEmployeeDetailsInvalid"));
		
	}
	
	public Response  updateEmployee(String payload) {
		   return given().headers().body(payload.toJson()).when()

                .put(getUrl("updateEmployee"));
		
	}
	
	public Response deleteEmployeeDetails() {
		return given().headers().delete(getUrl("deleteEmployeeDetails"));
		
	}
	
	public Response deleteEmployeeDetailsInvalid() {
		return given().headers().delete(getUrl("deleteEmployeeDetailsInvalid"));
		
	}
	
	private Object getUrl(String urltype) {
		String baseURI = "https://locolhost:8080/v2/employee";
		if(urltype.equals("createEmployee")) {
			baseURI=baseURI;
		}
		else if(urltype.equals("createMultipleEmployees")) {
			baseURI=baseURI+"/employee/createWithArray";
		}
		else if(urltype.equals("validLogin")) {
			baseURI=baseURI+"/employee/login?employeename=pandiya&password=Test@1234";
		}
		else if(urltype.equals("inValidLogin")) {
			baseURI=baseURI+"/employee/login?employeename=test&password=Test";
		}
		else if(urltype.equals("logout")) {
			baseURI=baseURI+"/employee/logout";
		}
		else if(urltype.equals("getEmployeeDetails") || urltype.equals("updateEmployee") || urltype.equals("deleteEmployeeDetails")) {
			baseURI=baseURI+"/employee/pandiya";
		}
		else if(urltype.equals("getEmployeeDetailsInvalid") || urltype.equals("deleteEmployeeDetailsInvalid") ) {
			baseURI=baseURI+"/employee/test";
		}
		return baseURI;
	}

	

}
