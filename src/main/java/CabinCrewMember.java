public class CabinCrewMember extends FlightCrew{

    public CabinCrewMember(String name, FlightCrewRank rank) {
        super(name, rank);
    }

    public String relayMessageToPassengers() {
        return "Please fasten your seatbelts!";
    }
}
