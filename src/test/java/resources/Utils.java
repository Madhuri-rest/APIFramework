package resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.util.Properties;

public class Utils {
    RequestSpecification rec;
    public RequestSpecification requestspecification() throws IOException {
        if(rec==null) {
            PrintStream log = new PrintStream(new FileOutputStream("log.txt"));
            rec = new RequestSpecBuilder().setBaseUri(getValue("baseURI"))
                    .addQueryParam("key", "qaclick123").setContentType(ContentType.JSON)
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .build();
            return rec;
        }
        return rec;
    }

    public static String getValue(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("D:\\APIFramework\\src\\test\\java\\resources\\globleVariable.properties");
        prop.load(fis);
        return  prop.getProperty(key);

    }
    public static String getResKValue(Response response,String key) {
        String res = response.asString();
        JsonPath js = new JsonPath(res);
        return js.get(key).toString();
    }
}
