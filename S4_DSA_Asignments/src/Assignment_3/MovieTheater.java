package Assignment_3;

public class MovieTheater {
    private final String theaterName;
    private final Seat[][] seats;
    private final int numRows;
    private final int seatsPerRow;

    public MovieTheater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;
        this.numRows = numRows;
        this.seatsPerRow = seatsPerRow;
        this.seats = new Seat[numRows][seatsPerRow];

        for (int row = 0; row < numRows; row++) {
            for (int seatNum = 0; seatNum < seatsPerRow; seatNum++) {
                seats[row][seatNum] = new Seat((char)('A' + row) + String.format("%02d", seatNum + 1));
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber) {
        for (int row = 0; row < numRows; row++) {
            for (int seatNum = 0; seatNum < seatsPerRow; seatNum++) {
                if (seats[row][seatNum].getSeatNumber().equals(seatNumber)) {
                    return seats[row][seatNum].reserve();
                }
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public boolean cancelReservedSeat(String seatNumber) {
        for (int row = 0; row < numRows; row++) {
            for (int seatNum = 0; seatNum < seatsPerRow; seatNum++) {
                if (seats[row][seatNum].getSeatNumber().equals(seatNumber)) {
                    return seats[row][seatNum].cancel();
                }
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public void printSeatingChart() {
        for (int row = 0; row < numRows; row++) {
            for (int seatNum = 0; seatNum < seatsPerRow; seatNum++) {
                System.out.print(seats[row][seatNum].isReserved() ? "X " : "0 ");
            }
            System.out.println();
        }
    }
}