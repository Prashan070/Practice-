package PracticeBasic.DesignPatternDemo.SingltonDemo;

public class LazyInitializationDemo {

    private static LazyInitializationDemo instance;


    private LazyInitializationDemo() {
    }

    public static LazyInitializationDemo getInstance() {

        if (instance == null) {
            instance = new LazyInitializationDemo();
        }

        return instance;
    }

}

class UtilizeClassLazy{

    public static void main(String[] args) {
        LazyInitializationDemo d1 = LazyInitializationDemo.getInstance();
        LazyInitializationDemo d2 =LazyInitializationDemo.getInstance();
        System.out.println(d1==d2);
    }


}


