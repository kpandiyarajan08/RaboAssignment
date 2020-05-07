##ModuleName:Delete Employee
##FeatureFileDesignedBy:Pandiyarajan
##LastUpdateDate:07 May 2020
##LastUpdateSummary: InitialDesign
Feature: Delete Employee

  @DeleteEmployee
  Scenario: delete employee details with valid employee name
    When user delete employee details with valid employee name 
    Then user should see the status code
    
  @DeleteEmployee-Invalid
  Scenario: delete employee details with invalid employee name
    When user delete employee details with invalid employee name 
    Then user should see the error status code
    
    