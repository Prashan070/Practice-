package PracticeBasic.BasicJavaUnderstanding;


/*
class AA implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ; i< 10 ; i++){
            System.out.println(i);
        }
    }
}



public class RunnableWithLamda {

    public static void main(String[] args) {

        AA a = new AA();
        Thread t = new Thread(a);
        t.start();

    }

}
*/


/*
public class RunnableWithLamda {

    public static void main(String[] args) {

        Runnable a = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        };
        Thread t = new Thread(a);
        t.start();

    }

}
*/


public class RunnableWithLamda {

    public static void main(String[] args) {

        Runnable a = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        Thread t = new Thread(a);
        t.start();

    }

}


