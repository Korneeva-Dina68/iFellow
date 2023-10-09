import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import specification.RequestSpecification;

import java.io.IOException;

import static api.APISteps.*;
import static api.CreateUser.createUserTest;


public class ApiTest extends RequestSpecification {
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Тестирование API по сериалу Рик и Морти")
    @Description("Найти информацию по персонажу, из списка последнего эпизода получить последнего персонажа, сверить их расу и местоположение")
    @Test
    public void RickAndMortyApi() throws IOException {
        gettingCharacterInformation("2");
        gettingLastCharacter();
        gettingSpeciesAndLocLastCharacter(idLastCharacter);
        checkLocationAndSpeciesTryAndCatch(speciesLastCharacter, speciesCharacter, locLastCharacter, locCharacter);
    }

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("201: успешное создание юзера")
    @Description("Создать запрос для создания юзера и свериться, что полученный response имеет валидные данные по значениям key и value")
    @Test
    void createUserAPITest() throws IOException {
        createUserTest();
    }
}
