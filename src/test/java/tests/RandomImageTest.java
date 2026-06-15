package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RandomImageTest extends BaseTest {

    @Test
    void shouldReturnRandomDogImage() {

        given()

        .when()
            .get(Endpoints.RANDOM_IMAGE)

        .then()
            .statusCode(200)
            .body("status", equalTo("success"))
            .body("message", containsString("https://"))
            .body("message", containsString(".jpg"));
    }
}