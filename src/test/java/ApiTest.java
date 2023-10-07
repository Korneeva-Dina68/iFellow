import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import specification.RequestSpecification;

import java.io.IOException;

import static api.APISteps.*;
import static api.CreateUser.createUserTest;


public class ApiTest extends RequestSpecification {
    @DisplayName("Погружение в API")
    @Test
    public void RickAndMortyApi() throws IOException {
        gettingCharacterInformation("2");
        gettingLastCharacter();
        checkLocationAndSpecies();
        checkLocationAndSpeciesTryAndCatch();
    }

    @DisplayName("Углубление в API")
    @Test
    void createUserAPITest() throws IOException {
        createUserTest();
    }
}
