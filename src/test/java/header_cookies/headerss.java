package header_cookies;

import io.restassured.http.Cookie;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class headerss {

    @Test
    public void send_request_wHeader(){

        given().
                baseUri("http://postman-echo.com").
                header("X-Real-IP", "192.168.1.101").
                header("X-Real-IP", "192.168.1.101", "192.168.1.998", "192.168.1.23").
                contentType("application/json")
        .when().
                post("/post")
        .then().log().all();
    }

    @Test
    public void send_request_wHeaderObj(){

        HashMap<String, Object> hider = new HashMap<String, Object>();
        hider.put("X-Real-IP", "192.168.1.101");
        hider.put("Content", 80);


        given().
                baseUri("http://postman-echo.com").
                headers(hider).
                contentType("application/json")
                .when().
                post("/post")
                .then().log().all();
    }

    @Test
    public void send_request_cookieSimple(){

        given().
                baseUri("http://postman-echo.com").
                contentType("application/json").
                cookie("user", "adfsdf", "dcvdvtrt")
                .when().
                post("/post")
                .then().log().all();
    }

    @Test
    public void send_request_cookieObj(){
        Cookie coke = new Cookie.Builder("tendangnhap", "hungtt")
                            .setSecured(false)
                            .setComment("testing cookies")
                            .build();

        given().
                baseUri("http://postman-echo.com").
                contentType("application/json").
                cookie(coke)
                .when().
                post("/post")
                .then().log().all();
    }
}
