package PracticeBasic.ExceptionHandlingDemo;


public class BasicException {

    void display() {


       try {
           int a = 10 / 0;
       }catch (ArithmeticException e){
           System.out.println("k");
       }finally {
           System.out.println("jaja");
       }
    }


    public static void main(String[] args) {

        BasicException vc = new BasicException();
        vc.display();

    }
}
