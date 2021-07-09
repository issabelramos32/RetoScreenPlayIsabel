Feature: Practice register qa form demoqa

  @scenario1excel
  Scenario: Full text box register whit excel
    Given that a web user wants to practice register form in demoqa
    When he fills all the requested fields in register section whit excel
    Then he should see him data

  @scenario2faker
  Scenario: Full text box register whit faker
    Given that a web user wants to practice register form in demoqa
    When he fills all the requested fields in register form whit faker
    Then he should see him data down in form

  @scenario3config
    Scenario: Full text box register whit config
    Given that a web user wants to practice register form in demoqa
    When he fills all the requested fields in register form section whit config
    Then he should see him data down in practice
