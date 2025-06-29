import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testPerformTaskWithinTimeout() {
        PerformanceTester pt = new PerformanceTester();
        assertTimeout(Duration.ofMillis(500), pt::performTask);
    }
}
