package PracticeBasic.MultiThreading;


public class DemonThread {

    public static void main(String[] args) {


        Thread userThread1 = new Thread(() -> {

            try {
                for (int i = 0; i <=10; i++) {
                    System.out.println("user thread running " + i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Thread demonthread = new Thread(() -> {

            try {

                for (int i = 0; i <=10; i++) {
                    System.out.println("demon thread running " + i);
                    Thread.sleep(2000);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });


        userThread1.start();
        demonthread.setDaemon(true);
        demonthread.start();

    }
}

