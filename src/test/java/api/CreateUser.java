package api;

import io.restassured.response.Response;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class CreateUser {
    public static String id;
    public static String createdAt;

    public static void createUserTest() throws IOException {

        JSONObject body = new JSONObject(new String(Files.readAllBytes(Paths.get("src/test/resources/api.json"))));
        body.put("name", "Tomato");
        body.put("job", "Eat maket");

        Response createUserTest = given()
                .body(body.toString())
                .when()
                .post("https://reqres.in/api/users/")
                .then()
                .statusCode(201)
                .body("name", equalTo("Tomato"))
                .body("job", equalTo("Eat maket"))
                .body("id", notNullValue())
                .body("createdAt", notNullValue())
                .extract()
                .response();

        id = new JSONObject(createUserTest.getBody().asString()).get("id").toString();
        createdAt = new JSONObject(createUserTest.getBody().asString()).get("createdAt").toString();
        System.out.println("Новый пользователь с id " + id + " создан " + createdAt);
    }
}
