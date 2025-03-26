package PracticeBasic.LLD.IRCTC.Entity;

import java.time.LocalDate;
import java.util.List;

public class Train {
    private String trainId;
    private String trainNumber;
    private LocalDate departuredate;
    private LocalDate arrivalDate;
    private List<Seat> seats;

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalDate getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(LocalDate departuredate) {
        this.departuredate = departuredate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Train(String trainId, String trainNumber, LocalDate departuredate, LocalDate arrivalDate, List<Seat> seats) {
        this.trainId = trainId;
        this.trainNumber = trainNumber;
        this.departuredate = departuredate;
        this.arrivalDate = arrivalDate;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId='" + trainId + '\'' +
                ", trainNumber='" + trainNumber + '\'' +
                ", departuredate=" + departuredate +
                ", arrivalDate=" + arrivalDate +
                ", seats=" + seats +
                '}';
    }



}
