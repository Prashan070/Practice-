package PracticeBasic.DesignPatternDemo.SingltonDemo;

public class EagerInitailizationDemo {

    private static final EagerInitailizationDemo instance = new EagerInitailizationDemo();

    private EagerInitailizationDemo() {

    }

    public static EagerInitailizationDemo getInstance() {
        return instance;
    }
}

class UtilizeEager {

    public static void main(String[] args) {
     EagerInitailizationDemo e1=    EagerInitailizationDemo.getInstance();
     EagerInitailizationDemo e2 = EagerInitailizationDemo.getInstance();

        System.out.println(e1==e2);
    }

}