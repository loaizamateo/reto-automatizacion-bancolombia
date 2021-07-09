Feature: verify trust benefits

  As a certification user
  It is required to validate the event when the client looks for
  the benefits of his trust account and identifies them

  Scenario: search for bancolombia benefits
    Given the user wants open browser an got to bancolombia
    When He seeks the benefits of his trust account
    Then he verifies his benefits