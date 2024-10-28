package Assignment_3;

public class Main {
    public static void main(String[] args) {
        // Create a movie theater with 5 rows and 6 columns
        MovieTheater theater = new MovieTheater("Cinema 1", 5, 6);

        // Print the initial seating chart
        System.out.println("Initial seating chart:");
        theater.printSeatingChart();

        // Reserve some seats
        System.out.println("\nReserving seats A01, B02, and C03:");
        theater.reserveSeat("A01");
        theater.reserveSeat("B02");
        theater.reserveSeat("C03");

        // Print the seating chart after reservations
        System.out.println("\nSeating chart after reservations:");
        theater.printSeatingChart();

        // Attempt to reserve an already reserved seat
        System.out.println("\nAttempting to reserve an already reserved seat A01:");
        if (!theater.reserveSeat("A01")) {
            System.out.println("Seat A01 is already reserved.");
        }

        // Cancel a reservation
        System.out.println("\nCancelling reservation for seat B02:");
        theater.cancelReservedSeat("B02");

        // Print the seating chart after cancellation
        System.out.println("\nSeating chart after cancellation:");
        theater.printSeatingChart();
    }
}