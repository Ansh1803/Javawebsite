class Travel {
    public void searchFlights(String destination) {
        System.out.println("Searching for flights to " + destination);
    }

    public void searchHotels(String location) {
        System.out.println("Searching for hotels in " + location);
    }

    public void bookReservation(String flight, String hotel) {
        System.out.println("Booking flight: " + flight + " and hotel: " + hotel);
    }

    public void cancelReservation(String reservationId) {
        System.out.println("Canceling reservation: " + reservationId);
    }
}

public class TravelExample {
    public static void main(String[] args) {
        Travel travel = new Travel();
        travel.searchFlights("New York");
        travel.searchHotels("Los Angeles");
        travel.bookReservation("AA123", "Hotel California");
        travel.cancelReservation("12345");
    }
}

/*
Output:
Searching for flights to New York
Searching for hotels in Los Angeles
Booking flight: AA123 and hotel: Hotel California
Canceling reservation: 12345
*/
