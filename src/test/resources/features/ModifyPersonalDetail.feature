Feature: Modify personal Detail

  Background: 
  
    Given user is logged with valid admin credentials
    When admin user is successfully logged in
    And admin navigates to Employee Information page

  @testName
  Scenario: Modify personal Detail by name
    Given admin searches employee by full name "Jack William Ngu"
    And admin selects employee from the list
    When admin navigates to Personal Details page and click to Edit
    Then admin adds new information and save
      | OtherId   | MaritalStatus | DateOfBirth | NickName | MilitaryService | SSN          | DriverLicenceNumber | SinNumber     |
      | 239483720 | Married       | 1996-Jun-27 | Jacki    | Marine Corps    | 294362382092 |   85793475093485098 | 4857349579834 |
 
 @testId
  Scenario: Modify personal Detail by id
    Given admin searches employee by id "10774"
    And admin selects employee from the list
    And admin navigates to Personal Details page and click to Edit
    When admin adds new information and save
