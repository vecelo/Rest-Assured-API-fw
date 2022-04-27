package schema;

import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class schema_valid {

    @Test
    public void schema_valid_json(){

        File filesosanh1 = new File("src/test/resources/schema_valid_json.json");

        given().baseUri("http://data.fixer.io/api/")
                .params("access_key", "b406c5d0bd55d77d592af69a930f4feb")
                .params("Symbols", "USD")
        .when().get("latest")
        .then().log().all().statusCode(200)
                .body(matchesJsonSchema(filesosanh1));
    }

    @Test
    public void schema_valid_xml_dtd(){
        //co loi do format cua xml ko de
        //sai do cach define trong file schema > nghien cu sau
        File filesosanh2 = new File("src/test/resources/schema_valid_xml.xsd");

        HashMap<String,String> paramss = new HashMap<>();
        paramss.put("q", "ho chi minh");
        paramss.put("APPID", "648b4d68e5cc52f2042959093666200e");
        paramss.put("mode", "xml");

        given().
                baseUri("http://api.openweathermap.org/data/2.5").
                params(paramss).
        when().
                get("/weather").
        then().body(matchesDtd(filesosanh2)).log().all().statusCode(200);
    }
}
