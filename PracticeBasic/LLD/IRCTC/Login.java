package PracticeBasic.LLD.IRCTC;

import java.util.HashMap;
import java.util.Map;

public class Login {

    private HashMap<String, String> hp;

    public Login() {
        hp = new HashMap<>();
        hp.put("a", "Prashant");
        hp.put("b", "raj");
        hp.put("c", "man");
    }

    public void registerUser(String user, String password) {

        if (hp.containsKey(user)) {
            System.out.println("User already exist");
        } else {
            hp.put(user, password);
            System.out.println("user added successfully");
        }

    }

    public boolean login(String user, String password) {

        if (!hp.containsKey(user)) {
            System.out.println("User not found");
            return false;
        }
        if (    hp.get(user).equals(password)){
            System.out.println("logined");
            return true;
        }
        System.out.println("incorrect passowrd");
        return false;
    }


    public static void main(String[] args) {

        Login login = new Login();
        System.out.println(login.hp);

    }

}
