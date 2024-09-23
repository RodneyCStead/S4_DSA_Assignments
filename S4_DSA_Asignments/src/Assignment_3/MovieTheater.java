package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class MovieTheater {
    private final String theaterName;
    private final List<Seat> seats;
    private final int numRows;
    private final int seatsPerRow;

    public MovieTheater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;
        this.numRows = numRows;
        this.seatsPerRow = seatsPerRow;
        this.seats = new ArrayList<>();

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
    }

    public void printSeatingChart() {
        int seatIndex = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                Seat seat = seats.get(seatIndex++);
                System.out.print(seat.isReserved() ? "X " : "0 ");
            }
            System.out.println();
        }
    }
}