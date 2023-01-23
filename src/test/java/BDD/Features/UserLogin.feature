Feature: User Login
  I Want To Check IF the user can Login to our Web-Site.

  Scenario Outline: User Login
    Given the user in the home page
    When I entered "<username>" , "<password>"
    And I click on login button
    Then user will be in home page for our web-site

    Examples:
    | username | password |
    | Admin | admin123 |