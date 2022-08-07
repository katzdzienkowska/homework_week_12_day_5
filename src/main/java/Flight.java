import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departure;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departure, String departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.bookedPassengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }
    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getCapacity() {
        return plane.getCapacity();
    }

    public int getTotalWeightAvailable() {
        return plane.getTotalWeight();
    }

    public int getNumberOfBookedPassengers() {
        return bookedPassengers.size();
    }

    public int getNumberOfCabinCrewMembers() {
        return cabinCrewMembers.size();
    }

    public int getNumberOfPilots() {
        return pilots.size();
    }

    public int getNumberOfAvailableSeats() {
        int allSeats = plane.getPlaneType().getCapacity();
        return allSeats - bookedPassengers.size();
    }

    public void bookPassengerToThePlane(Passenger passenger) {
        if (getNumberOfAvailableSeats() > 0) {
            bookedPassengers.add(passenger);
        }
    }

    public void addPilotToThePlane(Pilot pilot) {
        pilots.add(pilot);
    }

    public void addCabinCrewMemberToThePlane(CabinCrewMember cabinCrewMember) {
        cabinCrewMembers.add(cabinCrewMember);
    }
}


