import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {

    @Test
    void testFlightCreation() {
        var fl = new Flight("AA123", 100);
        assertNotNull(fl);
    }

    @Test
    void testInvalidFlightNumber() {
        assertThrows(
                RuntimeException.class,
                () -> {
                    var fl = new Flight("AA12", 200);
                }
        );
    }

}