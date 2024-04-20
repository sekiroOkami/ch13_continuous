import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightWithPassengerTest {
    private Flight flight = new Flight("AA123", 1);

    @Test
    void testAddRemovePassengers() {
        var ps = new Passenger("124-56-7890", "AJ", "US");
        assertTrue(flight.addPassenger(ps));
        assertEquals(1, flight.getNumberOfPassengers());

        assertTrue(flight.removePassenger(ps));
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    void testNumberOfSeats() {
        var ps1 = new Passenger("124-56-7890", "AJ", "US");
        flight.addPassenger(ps1);

        assertEquals(1, flight.getNumberOfPassengers());

        var ps2 = new Passenger("124-56-7888", "BA", "GB");

        assertThrows(
                RuntimeException.class,
                () -> flight.addPassenger(ps2)
        );
    }
}
