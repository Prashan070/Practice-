package PracticeBasic.DesignPatternDemo.Singlton;

public class Bill {

    private Bill(){}

    private static  class billhelper{

        private static final Bill instance = new Bill();

    }

    public  static Bill getInstance(){
        return billhelper.instance;
    }



}
