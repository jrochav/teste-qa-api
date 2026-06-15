package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BreedImagesTest extends BaseTest {

    @Test
    void shouldReturnImagesForValidBreed() {

        String breed = "hound";

        given()

        .when()
            .get(String.format(Endpoints.BREED_IMAGES, breed))

        .then()
            .statusCode(200)
            .body("status", equalTo("success"))
            .body("message.size()", greaterThan(0))
            .body("message[0]", containsString(breed));
    }
}