import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("John", FlightCrewRank.CAPTAIN, "ABC123");
    }

    @Test
    public void hasName() {
        assertEquals("John", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(FlightCrewRank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenceNumber() {
        assertEquals("ABC123", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyThePlane() {
        assertEquals("I'm flying the plane!", pilot.flyThePlane());
    }
}
