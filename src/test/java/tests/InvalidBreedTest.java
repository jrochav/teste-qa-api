package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class InvalidBreedTest extends BaseTest {

    @Test
    void shouldReturnErrorForInvalidBreed() {

        given()
        .when()
            .get("/breed/abc123/images")
        .then()
            .statusCode(404)
            .body("status", equalTo("error"));
    }
}