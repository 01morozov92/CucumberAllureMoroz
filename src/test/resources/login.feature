
  @01
Feature: login user
  Scenario: login user
    Then click "a" button
    Then input login
    Then input password
    Then click "new_user" button login
#    Then click "welcome-modal" close button
    Then content have text All projects