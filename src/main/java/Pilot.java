public class Pilot extends FlightCrew{

    private String licenceNumber;

    public Pilot(String name, FlightCrewRank rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }


    public String flyThePlane() {
        return "I'm flying the plane!";
    }
}
