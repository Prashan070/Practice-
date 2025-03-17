package PracticeBasic.DesignPatternDemo.Singlton;

public class Syncrolized {

    private Syncrolized(){}

    private static Syncrolized instance;

  synchronized public Syncrolized getInstance(){
        if(instance == null){
            instance = new Syncrolized();
        }
        return instance;
    }

}
