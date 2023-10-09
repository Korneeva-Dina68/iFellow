package api;

import io.qameta.allure.Step;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class CreateUser {

    @Step("Создать запрос для создания юзера")
    public static void createUserTest() throws IOException {

        JSONObject body = new JSONObject(new String(Files.readAllBytes(Paths.get("src/test/resources/api.json"))));
        body.put("name", "Tomato");
        body.put("job", "Eat maket");

        given()
                .body(body.toString())
                .when()
                .post("https://reqres.in/api/users/")
                .then()
                .statusCode(201)
                .body("name", equalTo("Tomato"))
                .body("job", equalTo("Eat maket"))
                .body("id", notNullValue())
                .body("createdAt", notNullValue());
    }
}
