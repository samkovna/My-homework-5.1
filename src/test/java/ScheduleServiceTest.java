import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScheduleServiceTest {
    @Test
    public void restMonth() {
        ScheduleService service = new ScheduleService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);

    }
}
