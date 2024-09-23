package Assignment_3;

public class Seat {
    private final String seatNumber;
    private boolean reserved;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.reserved = false;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public boolean reserve() {
        if (!this.reserved) {
            this.reserved = true;
            return true;
        }
        return false;
    }

    public boolean cancel() {
        if (this.reserved) {
            this.reserved = false;
            return true;
        }
        return false;
    }
}