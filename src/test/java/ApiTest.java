import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import specification.RequestSpecification;

import java.io.IOException;

import static api.APISteps.*;
import static api.CreateUser.createUserTest;


public class ApiTest extends RequestSpecification {
    @DisplayName("Тестирование API по сериалу Рик и Морти")
    @Test
    public void RickAndMortyApi() throws IOException {
        gettingCharacterInformation("2");
        gettingLastCharacter();
        gettingSpeciesAndLocLastCharacter(idLastCharacter);
        checkLocationAndSpeciesTryAndCatch(speciesLastCharacter, speciesCharacter, locLastCharacter, locCharacter);
    }

    @DisplayName("Углубленное тестирование API")
    @Test
    void createUserAPITest() throws IOException {
        createUserTest();
    }
}
