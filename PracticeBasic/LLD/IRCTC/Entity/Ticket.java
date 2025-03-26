package PracticeBasic.LLD.IRCTC.Entity;

import java.time.LocalDate;

public class Ticket {

    private String userid;
    private  String ticketId;
    private String source;
    private String destination;
    private LocalDate dateOfTravel;

    private Train train;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(LocalDate dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Ticket(String ticketId, String userid, String source, String destination, LocalDate dateOfTravel, Train train) {
        this.ticketId = ticketId;
        this.userid = userid;
        this.source = source;
        this.destination = destination;
        this.dateOfTravel = dateOfTravel;
        this.train = train;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", userid='" + userid + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", dateOfTravel=" + dateOfTravel +
                ", train=" + train +
                '}';
    }
}
