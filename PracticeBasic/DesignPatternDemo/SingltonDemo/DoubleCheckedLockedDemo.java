package PracticeBasic.DesignPatternDemo.SingltonDemo;

public class DoubleCheckedLockedDemo {

    private static volatile DoubleCheckedLockedDemo instance;

    private DoubleCheckedLockedDemo() {
    }


    public static DoubleCheckedLockedDemo getInstance() {

        if (instance == null) {

            synchronized (DoubleCheckedLockedDemo.class) {

                if (instance == null) {
                    instance = new DoubleCheckedLockedDemo();
                }
            }

        }
        return instance;

    }

}


class UtilizationDouble{

    public static void main(String[] args) {

        DoubleCheckedLockedDemo d1 = DoubleCheckedLockedDemo.getInstance();
        DoubleCheckedLockedDemo d2 = DoubleCheckedLockedDemo.getInstance();

        System.out.println(d1==d2);


    }

}