@workpermitcheck
Feature: Find out if you need a work permit

  Scenario:  navigate to Find out if you need a work permit page
    Given User Opens IRCC Webpage
    When I select Work
    Then I should be on the Work in Canada page
    Then select Find out if you need a work permit
    Then I should be on Find out if you need a work permit page
#
#  Scenario: Find out if you need a work permit
#    Given I am on Find out if you need a work permit page
    When I click on Find out what you need
    Then I Click on the radio button I’m the main or principal applicant
    Then I click on Next button
    Then I click on radio button NO
    Then I click on Next button
    Then I click on radio button I applied or will apply for permanent residence very soon
    Then I click on radio button in Canada and applied for permanent residence in a program under Express Entry
    Then I click on Next button
    Then I am on the You need a work permit page
    Then I Close the Browser