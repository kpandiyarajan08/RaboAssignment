##ModuleName:Update Employee
##FeatureFileDesignedBy:Pandiyarajan
##LastUpdateDate:07 May 2020
##LastUpdateSummary: InitialDesign
Feature: Update Employee

  @UpdateEmployee
  Scenario Outline: Update employee with valid data
  	Given get update "<valid-updateValue>" data
    When user update with valid "<valid-updateValue>" data
    Then ser should see the status code and updated employee details
    
    Examples:
    |valid-updateValue|
    |updateValidFirstName|
    |updateValidLastName|
    |updateValidEmail|
    |updateValidPassword|
    |updateValidPhone|
    |updateValidEmployeeStatus|
    
  @UpdateEmployee-Invalid
  Scenario Outline: Update employee with invalid data
  	Given get update "<invalid-updateValue>" data
    When user update with invalid "<invalid-updateValue>" data
    Then user should see the error status code
    
     Examples:
    |invalid-updateValue|
    |updateInvalidFirstName|
    |updateInvalidLastName|
    |updateInvalidEmail|
    |updateInvalidPassword|
    |updateInvalidPhone|
    |updateInvalidEmployeeStatus|
    
    