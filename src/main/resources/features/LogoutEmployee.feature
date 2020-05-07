##ModuleName:Logout Employee
##FeatureFileDesignedBy:Pandiyarajan
##LastUpdateDate:07 May 2020
##LastUpdateSummary: InitialDesign
Feature: Logout Employee

  @LogoutEmployee
  Scenario: logout employee
    When user logout 
    Then user should see the status code
    
    