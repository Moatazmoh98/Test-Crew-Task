Feature: HomePage

  Scenario Outline: check that packages types are displayed

    Given StcTv website is opened
    When press on Arrow countries List
    And select country name  "<countryName>"
    Then packageLite should be visible
    And packageClassic should be matched
    And packagePremium should be displayed
    Examples:
      | countryName |
      | KSA         |
      | Bahrain     |
      | Kuwait      |

  Scenario Outline: check that lite package prices and currencies are correct

    Given StcTv website is opened
    When press on Arrow countries List
    And select country name  "<countryName>"
    Then the lite package price is "<litePrice>"
    Examples:
      | countryName | litePrice     |
      | KSA         | 15 SAR/month  |
      | Bahrain     | 2 BHD/month   |
      | Kuwait      | 1.2 KWD/month |


  Scenario Outline: check that classic package prices and currencies are correct

    Given StcTv website is opened
    When press on Arrow countries List
    And select country name  "<countryName>"
    Then the classic package price is "<classicPrice>"
    Examples:
      | countryName | classicPrice  |
      | KSA         | 25 SAR/month  |
      | Bahrain     | 3 BHD/month   |
      | Kuwait      | 2.5 KWD/month |

  Scenario Outline: check that premium package prices and currencies are correct

    Given StcTv website is opened
    When press on Arrow countries List
    And select country name  "<countryName>"
    Then the premium package price is "<premiumPrice>"
    Examples:
      | countryName | premiumPrice  |
      | KSA         | 60 SAR/month  |
      | Bahrain     | 6 BHD/month   |
      | Kuwait      | 4.8 KWD/month |


  Scenario : check that Lite package prices and currency is correct for KSA

    Given StcTv website is opened
    When press on start your trial for lite
    Then the Lite package price is correct for KSA

  Scenario : check that Classic package prices and currency is correct for KSA

    Given StcTv website is opened
    When press on start your trial for classic
    Then the Classic package price is correct for KSA

  Scenario : check that Premium package prices and currency is correct for KSA

    Given StcTv website is opened
    When press on start your trial for Premium
    Then the Premium package price is correct for KSA

  Scenario : check that Lite package prices and currency is correct for Bahrain

    Given StcTv website is opened
    When press on Arrow countries List
    And select Bahrain Logo
    And press on start your trial for lite
    Then the Lite package price is correct for BAH

  Scenario : check that Classic package prices and currency is correct for Bahrain

    Given StcTv website is opened
    When press on Arrow countries List
    And select Bahrain Logo
    And press on start your trial for classic
    Then the Classic package price is correct for BAH

  Scenario : check that Premium package prices and currency is correct for Bahrain

    Given StcTv website is opened
    When press on Arrow countries List
    And select Bahrain Logo
    And press on start your trial for Premium
    Then the Premium package price is correct for BAH

  Scenario : check that Lite package prices and currency is correct for Kuwait

    Given StcTv website is opened
    When press on Arrow countries List
    And select Kuwait Logo
    And press on start your trial for lite
    Then the Lite package price is correct for KUW

  Scenario : check that Classic package prices and currency is correct for Kuwait

    Given StcTv website is opened
    When press on Arrow countries List
    And select Kuwait Logo
    And press on start your trial for classic
    Then the Classic package price is correct for KUW

  Scenario : check that Premium package prices and currency is correct for Kuwait

    Given StcTv website is opened
    When press on Arrow countries List
    And select Kuwait Logo
    And press on start your trial for Premium
    Then the Premium package price is correct for KUW

    Scenario: check that unregistered user can't login into the system
      Given StcTv website is opened
      When press on sign in button
      And fill user name field with data
      And press on submit button
      And fill password field with data
      Then an error message should be displayed

  Scenario: check that next button is disabled if no mail entered
    Given StcTv website is opened
    When press on sign in button
    And press on submit button
    Then validate that submit button is not clickable

      Scenario: check that language of the website is not changes after click on start your trial button
        Given StcTv website is opened
        When press on start your trial for lite
        And press on back button
        Then check that the language is not change

  Scenario: check that user can edit the phone number of the free account

    Given StcTv website is opened
    When press on Activate button
    And type in mobile phone text field
    And press on edit hypertext
    Then mobile phone text filed should be reset
    And mobile phone text filed should exist


