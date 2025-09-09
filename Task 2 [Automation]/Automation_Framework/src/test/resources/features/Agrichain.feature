@agrichain
Feature: Agrichain Longest Substring Calculator Functionality

  This feature covers the core calculation logic, UI elements, and navigation
  of the Agrichain website.

  @functional
  Scenario Outline: Verify the calculation for various string inputs
    Given I am on the Agrichain input page
    When I enter the string "<input_string>"
    And I click the submit button
    Then the output on the result page should be <expected_output>

    Examples:
      | Test Case                                    | input_string | expected_output |
      | Verify valid string with repeating characters| "abcabcbb"   | 3               |
      | Verify string with all unique characters     | "abcdefg"    | 7               |
      | Verify string with all identical characters  | "aaaaa"      | 1               |
      | Verify an empty string input                 | "(empty)"    | 0               |
      | Verify string with numbers and special chars | "a1b2!c3@"   | 8               |
      | Verify string with leading/trailing spaces   | "a b"        | 3               |
      | Verify case sensitivity                      | "aAbc"       | 4               |

  @ui
  Scenario: Verify placeholder text is visible on the input page
    Given I am on the Agrichain input page
    Then I should see the placeholder text "Enter String Input..." in the input field

  @navigation
  Scenario: Verify the "Back to Home" button functionality
    Given I am on the Agrichain input page
    When I enter the string "test"
    And I click the submit button
    And I am on the result page
    When I click the "Back to Home" button
    Then I should be redirected back to the input page

