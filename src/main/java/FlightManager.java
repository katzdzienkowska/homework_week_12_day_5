public class FlightManager {

    public FlightManager() {}

    public double totalBaggageWeight(Flight flight) {
        return flight.getTotalWeightAvailable() / 2;
    }

    public double baggageWeightPerPassenger(Flight flight) {
        return totalBaggageWeight(flight) / flight.getCapacity();
    }

    public double totalBaggageWeightBooked(Flight flight) {
        return baggageWeightPerPassenger(flight) * flight.numberOfBagsBooked();
    }

    public double totalBaggageWeightRemaining(Flight flight) {
        return totalBaggageWeight(flight) - totalBaggageWeightBooked(flight);
    }
}
