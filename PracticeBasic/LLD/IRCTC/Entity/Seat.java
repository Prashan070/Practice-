package PracticeBasic.LLD.IRCTC.Entity;

public class Seat {

    private String passengerId;
    private String seatNumber;
    private Boolean isBooked;

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Boolean getBooked() {
        return isBooked;
    }

    public void setBooked(Boolean booked) {
        isBooked = booked;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public Seat(String seatNumber, Boolean isBooked, String passengerId) {
        this.seatNumber = seatNumber;
        this.isBooked = isBooked;
        this.passengerId = passengerId;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", isBooked=" + isBooked +
                ", passengerId='" + passengerId + '\'' +
                '}';
    }
}
