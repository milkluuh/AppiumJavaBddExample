Feature: Example of our project structure

  As a QA
  I want to share our project structure
  So Hiptest team can help us

  @QA-001
  Scenario: Validate data
    Given user opens the app
    When user inputs data on cep de origem field
    And user inputs data on cep de destino field
    And user clicks on proximo passo button
    Then the app displays the calculos salvos screen
