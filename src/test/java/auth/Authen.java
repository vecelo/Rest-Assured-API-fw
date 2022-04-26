package auth;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Authen {

    // URI: https://postman-echo.com
    // endpoint: /digest-auth

    @Test
    public void digest_authen(){
        given().baseUri("https://postman-echo.com").auth().digest("postman","password").

        when().get("/digest-auth").

        then().log().all().statusCode(200);
    }

    @Test
    public void basic_authen(){
        given().baseUri("https://postman-echo.com").auth().basic("postman", "password").
        when().get("/basic-auth").
        then().log().all().statusCode(200);
    }

//    @Test
//    //BaseURI: https://api.twitter.com/1.1
//    //Endpoint: /statuses/update.json
//    String mytweet = "This is my tweets via rest assured";
//
//    public void tweet_OneAuth(){
//        given().baseUri().auth().oauth("4 cai value token day").
//            params("status", mytweet).
//        when().post("/statuses/update.json").
//        then().log().all().statusCode(200);
//    }

}
