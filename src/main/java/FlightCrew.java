public class FlightCrew extends Person {

    private FlightCrewRank rank;

    public FlightCrew(String name, FlightCrewRank rank) {
        super(name);
        this.rank = rank;
    }

    public FlightCrewRank getRank() {
        return rank;
    }
}
