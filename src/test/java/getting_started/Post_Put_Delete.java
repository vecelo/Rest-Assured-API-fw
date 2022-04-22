package getting_started;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.*;

public class Post_Put_Delete {

    @Test
    public void post_request_with_file(){

        File file1 = new File("src/test/resources/employee_data.json");

        int sothutu = given().baseUri("http://dummy.restapiexample.com/api/v1").
                contentType(ContentType.JSON).
                body(file1).
        when().post("/create").
        then().statusCode(200).
                body("data.salary", equalTo("123")).extract().path("data.id");

        System.out.println(sothutu);
    }

    @Test
    public void post_request_with_jsonObject(){

        JSONObject body2 = new JSONObject();
        body2.put("name" , "Tymothy");
        body2.put("salary" , "877");
        body2.put("age" , "39");

        int sothutu = given().baseUri("http://dummy.restapiexample.com/api/v1").
                contentType(ContentType.JSON).
                body(body2.toString()).
                when().post("/create").
                then().statusCode(200).
                body("data.salary", equalTo("877")).extract().path("data.id");

        System.out.println(sothutu);
    }
}
