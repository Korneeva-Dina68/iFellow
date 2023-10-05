import specification.RequestSpecification;

import java.io.IOException;

import static api.APISteps.*;
import static api.CreateUser.createUserTest;


public class ApiTest extends RequestSpecification {
    @org.junit.jupiter.api.Test
    public void RickAndMortyApi() throws IOException {
        gettingCharacterInformation("2");
        gettingLastCharacter();
        checkLocationAndSpecies();
        checkLocationAndSpeciesTryAndCatch();
        createUserTest();
    }
}
