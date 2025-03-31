package PracticeBasic.MultiThreading;

public class ThreadPriority  {


    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {


            System.out.println("Normal calll");
        });

        Thread t2 = new Thread(()->{

            System.out.println("Emergency calll");
        });


        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }

}
