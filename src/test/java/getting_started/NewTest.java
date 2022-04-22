package getting_started;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class NewTest {
    @Test
    public void simple_test_request(){

        given().
                baseUri("https://restcountries.com/v3.1/").
                when().
                get("/name/vietnam").
                then().
                statusCode(200).
                body(
                        "name[0].common", equalTo("Vietnam"),
                        "altSpellings", hasToString("VN"),
                        "ccn3", equalTo("704")
                );
    }

    @Test
    public void simple_xml_request(){

        given().
                baseUri("http://api.openweathermap.org/data/2.5").
                queryParam("q", "ho chi minh,vn").
                queryParam("APPID", "648b4d68e5cc52f2042959093666200e").
                queryParam("mode", "xml").
                when().
                get("/weather").
                then().
                statusCode(200).
                body(
                        "current.city.@name", equalTo("Ho Chi Minh City"),
                        "current.temperature.@unit", equalTo("celcius"),
                        "current.city.timezone", equalTo("25200")
                );
    }

    @Test
    public void extract_response_data(){
        Response res = given()
                .baseUri("https://restcountries.com/v3.1/").
                when()
                .get("/name/vietnam").
                then().
                extract().response();
        System.out.println(res.asString());
    }

    @Test
    public void extract_single_data_from_response(){
        String nhietdo = given().
                baseUri("http://api.openweathermap.org/data/2.5").
                queryParam("q", "ho chi minh,vn").
                queryParam("APPID", "648b4d68e5cc52f2042959093666200e").
                queryParam("mode", "xml").
                when().
                get("/weather").
                then().
                statusCode(200).
                body(hasItems()).extract().path("current.temperature.@value");
        System.out.println(nhietdo);
    }

    @Test
    public void verify_status_line(){
        given().
                baseUri("http://api.openweathermap.org/data/2.5").
                queryParam("q", "ho chi minh,vn").
                queryParam("APPID", "648b4d68e5cc52f20429590936662e").
                queryParam("mode", "xml").
                when().
                get("/weather").
                then().
                statusLine("HTTP/1.1 401 Unauthorized");
    }

}
