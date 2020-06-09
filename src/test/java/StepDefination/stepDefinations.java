package StepDefination;


import Pojo.AddPlace;
import Pojo.Location;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.AddPlacePayload;
import resources.ApiResources;
import resources.Utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class stepDefinations extends Utils {
    RequestSpecification req;
    ResponseSpecification res;
    Response response;
    AddPlacePayload data=new AddPlacePayload(); ;
     static String place_id;

    ApiResources resourceAPI;
    @Given("Add place Payload {string} {string} {string}")
    public void add_place_Payload(String name, String address, String language) throws IOException {
        // Write code here that turns the phrase above into concrete actions

       // data = new AddPlacePayload();
        req = given().spec(requestspecification()).body(data.addPlace(name,address,language));


    }

    @When("user calls {string} with http {string} request")
    public void user_calls_with_http_request(String apiResource,String httpmethod) {
        // Write code here that turns the phrase above into concrete actions
       resourceAPI=ApiResources.valueOf(apiResource);
    if(httpmethod.equalsIgnoreCase("POST"))
        response = req.when().post(resourceAPI.getResource()).then().extract().response();
    else if (httpmethod.equalsIgnoreCase("GET"))
        response = req.when().get(resourceAPI.getResource()).then().extract().response();
    }

    @Then("the API call got success with status code {int}")
    public void the_API_call_got_success_with_status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
          assertEquals(response.getStatusCode(),200);

    }

    @Then("{string} in response body is {string}")
    public void status_in_body_is_ok(String key,String value) {
        // Write code here that turns the phrase above into concrete actions

        assertEquals(getResKValue(response,key),value);
    }
    @Then("Verify place id created maps to {string} using {string}")
    public void verify_place_id_created_maps_to_using_GetPlaceAPI(String name, String apiResource) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        place_id = getResKValue(response,"place_id");
        req = given().spec(requestspecification()).queryParam("place_id",place_id);

        user_calls_with_http_request(apiResource,"GET");
        String actualName = getResKValue(response,"name");
        assertEquals(actualName,name);



    }
    @Given("Delete place Payload")
    public void delete_place_Payload() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        req = given().spec(requestspecification()).body(data.deletePayload(place_id));


    }


}
