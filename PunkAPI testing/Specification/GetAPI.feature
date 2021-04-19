Feature: PunkAPI
  Background: Get API

    Scenario: Find a random beer
      When User gets random Beer
      Then the id is printed to console