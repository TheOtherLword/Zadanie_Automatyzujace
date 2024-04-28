Feature: Checking Search and Let's Talk Function on Home Page

  Scenario Outline: Verifying email address box and checking if search function correctly
    Given Open web browser
    When Flow Dog Home Page is open
    And I check if Home Page is visible
    And I click Wyślij formularz i zobacz co możemy dla Ciebie zrobić
    And I check if email box is visible
    And I close contact form
    And I check if email box is not visible
    And I fill in search box with <search>
    And I click Więcej and go to article about Business Intelligence
    Then I verify if text <text> is visible
    And I click on Firm Logo to go to Home Page
    And I verify if Home Page is visible


    Examples:
    |search|text|
    |Business|"Rozwiązania Business Intelligence, umożliwiające eksplorację danych i procesów oraz ich analizę, znajdują zastosowanie w każdym sektorze."|