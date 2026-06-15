package base;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    static void setup() {

        RestAssured.baseURI = "https://dog.ceo/api";

        // Exibe request e response apenas quando alguma validação falhar
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}