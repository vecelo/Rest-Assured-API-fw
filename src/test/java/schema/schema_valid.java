package schema;

import org.testng.annotations.Test;
import java.io.File;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class schema_valid {

    @Test
    public void schema_valid_json(){

        File filesosanh = new File("src/test/resources/schema_valid_json.json");

        given().baseUri("http://data.fixer.io/api/")
                .params("access_key", "b406c5d0bd55d77d592af69a930f4feb")
                .params("Symbols", "USD")
        .when().get("latest")
        .then().log().all().statusCode(200)
                .body(matchesJsonSchema(filesosanh));
    }
}
