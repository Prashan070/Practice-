package PracticeBasic.ExceptionHandlingDemo;

class underageex extends Exception {
    public underageex(String message) {
        super(message);
    }
}

public class BasicException {


    void display(int age) {
        try {

            if (age > 18) {
                throw new underageex("Under age ex");
            }
        }catch (underageex ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {

        BasicException bs = new BasicException();
        bs.display(19);
    }
}
