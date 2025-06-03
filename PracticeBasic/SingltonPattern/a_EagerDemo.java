package PracticeBasic.SingltonPattern;

public class a_EagerDemo {

    private static final a_EagerDemo instance = new a_EagerDemo();

    private a_EagerDemo(){

    }

    public static a_EagerDemo getInstance(){
        return instance;
    }
}
