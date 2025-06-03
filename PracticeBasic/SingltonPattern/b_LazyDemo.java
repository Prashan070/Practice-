package PracticeBasic.SingltonPattern;

public class b_LazyDemo {

    private static b_LazyDemo instance;

    private b_LazyDemo(){

    }
    public static b_LazyDemo getInstance(){
        if(instance == null){
            instance = new b_LazyDemo();
        }
        return instance;
    }
}
