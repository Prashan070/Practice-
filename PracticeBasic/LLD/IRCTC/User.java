package PracticeBasic.LLD.IRCTC;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userId;
    private String userName;
    private String password;
    private List<Booking> bookingList = new ArrayList<>();

    public User(Long userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }
}
