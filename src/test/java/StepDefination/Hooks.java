package StepDefination;

import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {
    @Before("@deletePlace")
    public void beforeScenario() throws IOException {
        stepDefinations s = new stepDefinations();

        s.add_place_Payload("Shetty", "French", "Asia");
        s.user_calls_with_http_request("AddPlaceAPI", "POST");
        s.verify_place_id_created_maps_to_using_GetPlaceAPI("Shetty", "getPlaceAPI");
    }
}
