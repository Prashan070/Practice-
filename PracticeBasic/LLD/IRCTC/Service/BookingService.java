package PracticeBasic.LLD.IRCTC.Service;

import PracticeBasic.LLD.IRCTC.Entity.User;

import java.util.HashMap;

public class BookingService {


    private HashMap<Integer,User> userCredentials = new HashMap<>();


    BookingService(){
        userCredentials.put(1, new User("prashan","100","Password@123"));
        userCredentials.put(2, new User("Rohit","101","Password@123"));
        userCredentials.put(3, new User("Harsh","102","Password@123"));
        userCredentials.put(4, new User("Pradip","103","Password@123"));
    }


    public void printUserCredential()
    {
        System.out.println(userCredentials);
    }

    public void loginUser(String user, String password){




    }
    public void registerUser (String user, String name, String password){
        if(userCredentials.containsKey(user)){
            System.out.println("User already exist");

        }


    }



    public static void main(String[] args) {

        BookingService bookingService = new BookingService();

    }



}
