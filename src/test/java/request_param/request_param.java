package request_param;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Objects;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class request_param {

    @Test
    public void handling_query_param() {
//        https://restcountries.com/v3.1/name/aruba?fullText=true

        given().
                baseUri("http://api.openweathermap.org/data/2.5").
                param("q", "ho chi minh,vn").
                param("APPID", "648b4d68e5cc52f2042959093666200e").
                param("lang", "vi").
                when().
                get("/weather").
                then().
                log().all().
                statusCode(200);
    }

    @Test
    public void handling_query_param_hashmap() {

        HashMap<String, String> paramss = new HashMap<String, String>();
        paramss.put("q", "ho chi minh");
        paramss.put("lang", "vi");
        paramss.put("APPID", "648b4d68e5cc52f2042959093666200e");

        given().
                baseUri("http://api.openweathermap.org/data/2.5").
                params(paramss).
                when().
                get("/weather").
                then().
                log().all().
                statusCode(200);
    }

    @Test
    public void handling_path_param(){

//        https://restcountries.com/v3.1/name/{name}?fullText=true

        given().
                baseUri("https://restcountries.com/v3.1").
                pathParams("name", "china").
                queryParam("fullText", false).
                when().
                get("/name/{name}").
                then().
                log().all().
                statusCode(200);
    }

    @Test
    public void handling_form_param(){

//        http://postman-echo.com/post

        given().
                baseUri("http://postman-echo.com").
//                contentType("application/x-www-form-urlencoded;charset=UTF-8").
                contentType("application/json").
//                contentType("multipart/form-data").
                formParam("name",3).
                when().
                post("/post").
                then().
                log().all().
                statusCode(200);
    }
}
