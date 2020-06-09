Feature: Validating the Add place APIS
  @AddPlace
  Scenario Outline: Verify the place has been added successfully by add API

    Given Add place Payload "<name>" "<address>" "<language>"
    When user calls "AddPlaceAPI" with http "Post" request
    Then the API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And Verify place id created maps to "<name>" using "getPlaceAPI"

    Examples:
      | name |address|language
      |Madhu |DNR c-702|English
@deletePlace
Scenario: Verify delete feature

    Given Delete place Payload
    When user calls "deletePlaceAPI" with http "Post" request
    Then the API call got success with status code 200
    And "status" in response body is "OK"
