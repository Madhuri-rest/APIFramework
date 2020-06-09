$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/placeValidation.feature");
formatter.feature({
  "name": "Validating the Add place APIS",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify the place has been added successfully by add API",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddPlace"
    }
  ]
});
formatter.step({
  "name": "Add place Payload \"\u003cname\u003e\" \"\u003caddress\u003e\" \"\u003clanguage\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"AddPlaceAPI\" with http \"Post\" request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "name": "\"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify place id created maps to \"\u003cname\u003e\" using \"getPlaceAPI\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "address"
      ]
    },
    {
      "cells": [
        "Madhu",
        "DNR c-702"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the place has been added successfully by add API",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddPlace"
    }
  ]
});
formatter.step({
  "name": "Add place Payload \"Madhu\" \"DNR c-702\" \"\u003clanguage\u003e\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.stepDefinations.add_place_Payload(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"AddPlaceAPI\" with http \"Post\" request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.stepDefinations.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.stepDefinations.the_API_call_got_success_with_status_code(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.stepDefinations.status_in_body_is_ok(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.stepDefinations.status_in_body_is_ok(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify place id created maps to \"Madhu\" using \"getPlaceAPI\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.stepDefinations.verify_place_id_created_maps_to_using_GetPlaceAPI(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify delete feature",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@deletePlace"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Delete place Payload",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.stepDefinations.delete_place_Payload()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"deletePlaceAPI\" with http \"Post\" request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.stepDefinations.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.stepDefinations.the_API_call_got_success_with_status_code(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.stepDefinations.status_in_body_is_ok(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});