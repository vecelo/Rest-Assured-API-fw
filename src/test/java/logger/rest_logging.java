package logger;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasToString;

public class rest_logging {

    @Test
    public void log_all(){

        given().
                baseUri("https://restcountries.com/v3.1/").
                when().
                get("/name/vietnam").
                then().
//                log().all();
//                log().body();
                log().everything();
    }

    @Test
    public void log_ifError(){

        given().
                baseUri("https://restcountries.com/v3.1/").
                when().
                get("/name/vietminh").
                then().
//                log().all();
//                log().body();
//        log().ifError();
//        log().ifStatusCodeIsEqualTo(400);
        log().ifValidationFails().statusCode(200);
    }
}
