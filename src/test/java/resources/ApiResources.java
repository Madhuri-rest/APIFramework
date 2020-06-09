package resources;

public enum  ApiResources {


    AddPlaceAPI("/maps/api/place/add/json"),
    getPlaceAPI("/maps/api/place/get/json"),
    deletePlaceAPI("/maps/api/place/delete/json");
private String resource;
    ApiResources(String s) {
        this.resource = s;
    }
    public String getResource(){
        return resource;
    }
}
