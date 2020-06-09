package resources;

import Pojo.AddPlace;
import Pojo.Location;

import java.util.ArrayList;
import java.util.List;

public class AddPlacePayload {
  public AddPlace addPlace(String name, String address, String language){
      Location ls = new Location();
      ls.setLat(-38.383494);
      ls.setLng(33.427362);
      List<String> ty = new ArrayList<String>() ;
      ty.add("shoe park");
      ty.add("shop");

      AddPlace ad = new AddPlace();
      ad.setLocation(ls);
      ad.setAccuracy(50);
      ad.setName(name);
      //ad.setName("Frontline house");
      ad.setPhone_number("(+91) 983 893 3937");
      ad.setAddress(address);
     // ad.setAddress("29, side layout, cohen 09");
      ad.setTypes(ty);
      ad.setWebsite("http://google.com");
      ad.setLanguage(language);
     // ad.setLanguage("French-IN");
      return ad;

    }

    public String deletePayload(String place_id){
      return "{\r\n    \"place_id\":\""+place_id+"\"\r\n}";
    }
}
