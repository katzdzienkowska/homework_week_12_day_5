import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Patrick", FlightCrewRank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("Patrick", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(FlightCrewRank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessageToPassengers() {
        assertEquals("Please fasten your seatbelts!", cabinCrewMember.relayMessageToPassengers());
    }


}
