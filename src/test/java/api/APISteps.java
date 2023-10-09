package api;

import io.qameta.allure.*;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.opentest4j.AssertionFailedError;

import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.*;

@DisplayName("Тестирование API по сериалу Рик и Морти")
@Owner("Корнеева")
public class APISteps {
    public static String lastEpisode;
    public static int episode;
    public static String idLastCharacter;
    public static String speciesCharacter;
    public static String locCharacter;
    public static String speciesLastCharacter;
    public static String locLastCharacter;

    @Step("Найти информацию по персонажу с id {id}")
    @DisplayName("Найти информацию по персонажу")
    @Description("Найти информацию по персонажу: получить его расу и местополежение, выбрать последний эпизод")
    @Severity(SeverityLevel.NORMAL)
    public static void gettingCharacterInformation(String id) {
        Response gettingCharacterInformation = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + id)
                .then()
                .statusCode(200)
                .extract().response();

        episode = new JSONObject(gettingCharacterInformation.getBody().asString()).getJSONArray("episode").length() - 1;
        lastEpisode = new JSONObject(gettingCharacterInformation.getBody().asString()).getJSONArray("episode").get(episode).toString();

        speciesCharacter = new JSONObject(gettingCharacterInformation.getBody().asString()).get("species").toString();
        locCharacter = new JSONObject(gettingCharacterInformation.getBody().asString()).getJSONObject("location").get("name").toString();
    }

    @Step("Получить из списка последнего эпизода последнего персонажа")
    @DisplayName("Получить из списка последнего эпизода последнего персонажа")
    @Description("Получить из списка последнего эпизода последнего персонажа")
    @Severity(SeverityLevel.NORMAL)
    public static void gettingLastCharacter() {
        Response gettingLastCharacter = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/episode/" + (episode + 1))
                .then()
                .statusCode(200)
                .extract().response();

        idLastCharacter = new JSONObject(gettingLastCharacter.getBody().asString()).getJSONArray("characters").get(new JSONObject(gettingLastCharacter.getBody().asString()).getJSONArray("characters").length() - 1).toString().replaceAll("[^0-9]", "");
    }
    @Step("Узнать расу и местоположение последнего персонажа с id {idLastCharacter}")
    @DisplayName("Узнать расу и местоположение последнего персонажа")
    @Description("Узнать расу и местоположение последнего персонажа для последующего сравнения")
    @Severity(SeverityLevel.NORMAL)
    public static void gettingSpeciesAndLocLastCharacter(String idLastCharacter) {
        Response locationLastCharacter = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + idLastCharacter)
                .then()
                .statusCode(200)
                .extract().response();

        speciesLastCharacter = new JSONObject(locationLastCharacter.getBody().asString()).get("species").toString();
        locLastCharacter = new JSONObject(locationLastCharacter.getBody().asString()).getJSONObject("location").get("name").toString();
    }

    @Step("Сравнить расу и местоположение двух персонажей")
    @DisplayName("Сравнить расу и местоположение двух персонажей")
    @Description("Сравнить расу и местоположение двух персонажей при помощи ассертов")
    @Severity(SeverityLevel.NORMAL)
    public static void checkLocationAndSpeciesTryAndCatch(String speciesLastCharacter, String speciesCharacter, String locLastCharacter, String locCharacter) {
        try {
            Assertions.assertEquals(speciesLastCharacter, speciesCharacter);
            Assertions.assertEquals(locLastCharacter, locCharacter);
        } catch (AssertionFailedError e) {
            System.out.println("Внимание!!! У сравниваемых персонажей раса или местоположение отличаются!");
        }
    }
}
