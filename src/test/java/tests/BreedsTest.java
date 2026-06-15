package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BreedsTest extends BaseTest {

    @Test
    void shouldReturnAllAvailableBreedsSuccessfully() {

        given()

        .when()
            .get(Endpoints.ALL_BREEDS)

        .then()
            .statusCode(200)
            .body("status", equalTo("success"))
            .body("message", notNullValue())
            .body("message.hound", notNullValue())
            .body("message.pug", notNullValue());
    }
}