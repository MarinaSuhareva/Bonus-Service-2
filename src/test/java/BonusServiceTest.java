import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})


    public void calculationOfBonuses(int amount, boolean registred, int expected) {
        BonusService service = new BonusService();
        int actual = service.calculate(amount, registred);
        Assertions.assertEquals(expected, actual);
    }
}
