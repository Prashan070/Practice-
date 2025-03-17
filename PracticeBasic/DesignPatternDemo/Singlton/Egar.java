package PracticeBasic.DesignPatternDemo.Singlton;


public class Egar {

    private Egar(){}

    private static final Egar instance = new Egar();

    public static Egar getInstance(){
        return instance;
    }




}
