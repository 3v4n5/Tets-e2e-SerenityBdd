Feature: Registration

  Scenario Outline: Succesfull Registration
    Given User wants to sign up in the aplication
    When User sends required information to sign up
      | <name> | <last name> | <age> | <email> | <country>  |
    Then User should have a new account created
    Examples:
      | name    | last name | age | email                     | country  |
      | Evans   | Ricardo   | 35  | evananyta@hotmail.com     | Colombia |
      | Ricardo | Mondragon | 42  | emondragon@qvision.com.co | Colombia |


  Scenario: Missing required fields for registration
    Given User wants to sign up in the aplication
    When User does not send the required information
    Then User should be told all fields are required


#  String expectedName = "Evans";
#  String expectedlastName = "Mondragon";
#  String expectedAge = "34";
#  String expectedCountry = "Colombia";
#  String expectedEmail = "evananyta@hotmail.com";
