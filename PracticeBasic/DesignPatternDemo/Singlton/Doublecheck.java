package PracticeBasic.DesignPatternDemo.Singlton;

public class Doublecheck {

    private Doublecheck(){}

    private static volatile Doublecheck instance;


    public static Doublecheck getInstance(){

        if(instance == null){

            synchronized (Doublecheck.class){

                if(instance == null){

                    instance= new Doublecheck();

                }

            }

        }
        return instance;
    }


}
