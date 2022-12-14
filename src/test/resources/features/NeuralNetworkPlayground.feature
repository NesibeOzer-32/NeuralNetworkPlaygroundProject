@test
Feature: Testing functionality of Neural Network Playground Website

  Scenario:Functionality of buttons in Neural Network Playground
    Given user goes to the Neural Network Playground page
    When user reports the test loss value
    And  user changes dataset to exclusive
    Then dataset has been changed by user
    And user changes noise to five percent
    And noise has been changed by user
    And user selects two more features
    And two more features has been selected by user
    And user removes two neurons
    And neurons has been removed by user
    And user changes learning rate to point one .
    And learning rate to point one has been changed by user
    And user clicks to run the simulation.
    And user waits until epoch is more than point three.
    And epoch is more than point three
    And user reports the last test loss value