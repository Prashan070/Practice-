package PracticeBasic.DesignPatternDemo.Singlton;

public class Lazy {
    private Lazy(){}

    private static Lazy instance;

    public Lazy getInstance(){
        if(instance == null){
            instance = new Lazy();
        }
        return instance;
    }


}
