##ModuleName:Login Employee
##FeatureFileDesignedBy:Pandiyarajan
##LastUpdateDate:07 May 2020
##LastUpdateSummary: InitialDesign
Feature: Login Employee

  @LoginEmployee-WithValidCretendials
  Scenario: Login employee with valid credentials
    When user login with valid credentials
    Then user should see the status code
    
    @LoginEmployee-WithInValidCretendials
  Scenario: Login employee with valid credentials
    When user login with invalid credentials
    Then user should see the error status code 