package Tests_tab;

import io.restassured.http.Cookie;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;


public class response_validation {

    @Test
    public void response_header(){
        given().
                baseUri("https://restcountries.com/v3.1").
                pathParam("lang","slv").
        when().
                get("/lang/{lang}").
        then().
                time(lessThan(1200L), TimeUnit.MILLISECONDS).
                header("content-encoding", "gzip");
    }

    @Test
    public void response_header_extract(){
        Headers hidder = given().baseUri("https://restcountries.com/v3.1").pathParam("lang","slv").
                        when().get("/lang/{lang}").
                        then().extract().headers();

        System.out.println(hidder.getValue("Server"));
        System.out.println(hidder.getValue("Keep-Alive"));
        System.out.println(hidder.getValue("Connection"));
    }

    @Test
    public void response_cookie_extract(){
        Map <String, String> cookee = given().
                                        baseUri("http://postman-echo.com").
                                        contentType("application/json").
                                        when().
                                        post("/post").
                                        then().extract().cookies();

        System.out.println(cookee.get("sails.sid"));
    }

    @Test
    public void response_header_extract_cookie(){
        Headers hidder2 = given().
                            baseUri("http://postman-echo.com").
                            contentType("application/json").
                        when().
                            post("/get").
                        then().log().all().extract().headers();

        System.out.println(hidder2.getValue("Cookie"));
//        System.out.println(hidder2.getValue("Keep-Alive"));
//        System.out.println(hidder2.getValue("Connection"));
    }

    @Test
    public void response_body_extract(){
        Response resbody = given().
                            baseUri("http://postman-echo.com").
                        when().
                            get("/delay/3").
//                        then().extract().response();
                         then().body()
          String body1 = resbody.path("delay");
          System.out.println(body1);
    }
}
