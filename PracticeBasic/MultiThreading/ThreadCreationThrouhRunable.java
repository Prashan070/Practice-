package PracticeBasic.MultiThreading;

import javax.naming.NamingEnumeration;

public class ThreadCreationThrouhRunable {

    public static void main(String[] args) {

        Testt t = new Testt();
        Thread tt = new Thread(t);
        tt.start();

        Thread tt2 = new Thread(tt);
        tt2.start();

    }

}




class Testt implements Runnable{


    @Override
    public void run() {
        System.out.println("Inside the runnable");
    }


}