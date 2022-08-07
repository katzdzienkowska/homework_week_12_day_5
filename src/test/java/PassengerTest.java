import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Kat", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Kat", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }
}
