package PracticeBasic.LLD.IRCTC.Entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    private String userId;

    private String hashPassword;

    private List<Ticket> ticketBooked = new ArrayList<>();




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public List<Ticket> getTicketBooked() {
        return ticketBooked;
    }

    public void setTicketBooked(List<Ticket> ticketBooked) {
        this.ticketBooked = ticketBooked;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", hashPassword='" + hashPassword + '\'' +
                ", ticketBooked=" + ticketBooked +
                '}';
    }

    public User(String name, String userId, String hashPassword) {
        this.name = name;
        this.userId = userId;
        this.hashPassword = hashPassword;
    }



}
