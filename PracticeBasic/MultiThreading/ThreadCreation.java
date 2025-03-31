package PracticeBasic.MultiThreading;

public class ThreadCreation {

    public static void main(String[] args) {

        Test t = new Test();
        t.start();
        System.out.println("Main theread");

    }
}

class Test extends Thread{

    @Override
    public void run() {
        System.out.println("Run method inside");
    }
}