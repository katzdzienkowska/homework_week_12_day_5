import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;

    @Before
    public void before() {
        flightManager = new FlightManager();
        pilot1 = new Pilot("George", FlightCrewRank.CAPTAIN, "DEF123");
        pilot2 = new Pilot("Zack", FlightCrewRank.FIRST_OFFICER, "WER345");
        plane = new Plane(PlaneType.BOEING_747);
        cabinCrewMember1 = new CabinCrewMember("Helen", FlightCrewRank.INFLIGHT_MANAGER);
        cabinCrewMember2 = new CabinCrewMember("Bob", FlightCrewRank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Oskar", 1);
        passenger2 = new Passenger("Jess", 2);
        passenger3 = new Passenger("Alex", 2);
        passenger4 = new Passenger("Matt", 4);
        passenger5 = new Passenger("Kathryn", 5);
        passenger6 = new Passenger("Milo", 1);
        ArrayList<Pilot> pilots = new ArrayList<>();
        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
        ArrayList<Passenger> bookedPassengers = new ArrayList<>();
        flight = new Flight(plane, "FGR536", "EDI", "KRK", "14:35");
    }

    @Test
    public void canCalculateBaggageWeightPerPassenger() {
        assertEquals(10, flightManager.baggageWeightPerPassenger(flight), 0.0);
    }

    @Test
    public void canCalculateBaggageWeightBookedByPassengers() {
        flight.bookPassengerToThePlane(passenger1);
        flight.bookPassengerToThePlane(passenger2);
        flight.bookPassengerToThePlane(passenger3);
        assertEquals(50, flightManager.totalBaggageWeightBooked(flight), 0.0);
    }

    @Test
    public void canCalculateRemainingBaggageWeight() {
        flight.bookPassengerToThePlane(passenger1);
        flight.bookPassengerToThePlane(passenger2);
        flight.bookPassengerToThePlane(passenger3);
        assertEquals(0, flightManager.totalBaggageWeightRemaining(flight), 0.0);
    }

    @Test
    public void canCalculateRemainingBaggageWeightWhenEmpty() {
        assertEquals(50, flightManager.totalBaggageWeightRemaining(flight), 0.0);
    }
}
