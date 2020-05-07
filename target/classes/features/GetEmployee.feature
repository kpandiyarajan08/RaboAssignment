##ModuleName:Get Employee
##FeatureFileDesignedBy:Pandiyarajan
##LastUpdateDate:07 May 2020
##LastUpdateSummary: InitialDesign
Feature: Get Employee

  @GetEmployee
  Scenario: get employee details with valid employee name
    When user get employee details with valid employee name 
    Then user should see the status code
    
  @GetEmployee-Invalid
  Scenario: get employee details with invalid employee name
    When user get employee details with invalid employee name 
    Then user should see the error status code
    
    