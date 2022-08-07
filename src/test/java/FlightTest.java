import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot1;
    Pilot pilot2;
    Plane plane;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;

    @Before
    public void before() {
        pilot1 = new Pilot("George", FlightCrewRank.CAPTAIN, "DEF123");
        pilot2 = new Pilot("Zack", FlightCrewRank.FIRST_OFFICER, "WER345");
        plane = new Plane(PlaneType.BOEING_747);
        cabinCrewMember1 = new CabinCrewMember("Helen", FlightCrewRank.INFLIGHT_MANAGER);
        cabinCrewMember2 = new CabinCrewMember("Bob", FlightCrewRank.FLIGHT_ATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Lisa", FlightCrewRank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Oskar", 1);
        passenger2 = new Passenger("Jess", 2);
        passenger3 = new Passenger("Alex", 3);
        passenger4 = new Passenger("Matt", 4);
        passenger5 = new Passenger("Kathryn", 5);
        passenger6 = new Passenger("Milo", 1);
        ArrayList<Pilot> pilots = new ArrayList<>();
        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
        ArrayList<Passenger> bookedPassengers = new ArrayList<>();
        flight = new Flight(plane, "FGR536", "EDI", "KRK", "14:35");
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FGR536", flight.getFlightNumber());
    }

    @Test
    public void hasDestinationAirport(){
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("KRK", flight.getDeparture());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("14:35", flight.getDepartureTime());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(5, flight.getCapacity());
    }

    @Test
    public void canGetTotalWeightAvailable() {
        assertEquals(100, flight.getTotalWeightAvailable());
    }

    @Test
    public void canGetNumberOfBookedPassengers() {
        assertEquals(0, flight.getNumberOfBookedPassengers());
    }

    @Test
    public void canGetNumberOfCabinCrewMembers() {
        assertEquals(0, flight.getNumberOfCabinCrewMembers());
    }

    @Test
    public void canGetNumberOfPilots() {
        assertEquals(0, flight.getNumberOfPilots());
    }

    @Test
    public void canReturnNumberOfAvailableSeats() {
        flight.bookPassengerToThePlane(passenger1);
        flight.bookPassengerToThePlane(passenger2);
        assertEquals(3, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void canBookPassengerToThePlane() {
        flight.bookPassengerToThePlane(passenger1);
        flight.bookPassengerToThePlane(passenger2);
        flight.bookPassengerToThePlane(passenger3);
        assertEquals(3, flight.getNumberOfBookedPassengers());
    }

    @Test
    public void cannotBookPassengerToThePlane() {
        flight.bookPassengerToThePlane(passenger1);
        flight.bookPassengerToThePlane(passenger2);
        flight.bookPassengerToThePlane(passenger3);
        flight.bookPassengerToThePlane(passenger4);
        flight.bookPassengerToThePlane(passenger5);
        flight.bookPassengerToThePlane(passenger6);
        assertEquals(5, flight.getNumberOfBookedPassengers());
    }

    @Test
    public void canAddPilotToThePlane() {
        flight.addPilotToThePlane(pilot1);
        assertEquals(1, flight.getNumberOfPilots());
    }

    @Test
    public void canAddCabinCrewMemberToThePlane() {
        flight.addCabinCrewMemberToThePlane(cabinCrewMember1);
        assertEquals(1, flight.getNumberOfCabinCrewMembers());
        }
}
