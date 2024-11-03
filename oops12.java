class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public void checkFlightStatus() {
        System.out.println("Flight " + flightNumber + " to " + destination + " departs at " + departureTime);
    }
}

public class AirplaneExample {
    public static void main(String[] args) {
        Airplane flight = new Airplane("AA123", "New York", "10:30 AM");
        flight.checkFlightStatus();
    }
}

/*
Output:
Flight AA123 to New York departs at 10:30 AM
*/
