##ModuleName:Create Employee
##FeatureFileDesignedBy:Pandiyarajan
##LastUpdateDate:07 May 2020
##LastUpdateSummary: InitialDesign
Feature: Create Employee

  @CreateEmployee-WithValidData
  Scenario: Create employee with all valid inputs
    Given get "createEmployeeValid" data
    When user create employee with "createEmployeeValid" data
    Then user should see the status code and created employee details

  @CreateEmployee-WithInvalidData
  Scenario Outline: Try to create employee with invalid inputs (ie. Invalid Id, email, phone)
    Given get "<invalid_data>" data
    When user create employee with "<invalid_data>" data
    Then user should see the error code and message

    Examples: 
      | invalid_data  |
      | invalid_id    |
      | invalid_email |
      | invalid_phone |

	@CreateEmployee-WithOutData
  Scenario Outline: Try to create employee without mandatory values
    Given get "<without_mandatory>" data
    When user create employee with "<without_mandatory>" data
    Then user should see the error code and message

    Examples: 
      | without_mandatory      |
      | without_id             |
      | without_employeename   |
      | without_email          |
      | without_password       |
      | without_phone          |
      | without_employeeStatus |

	@CreateMultipleEployee
  Scenario: Create array of multiple employees
    Geven get "create2Employee" data
    When user create multiple employee with "create2Employee" data
    Then user should see the status code and created employee details
