package PracticeBasic.DesignPatternDemo.SingltonDemo;

public class SynchronizedBlockDemo {

    private static SynchronizedBlockDemo instance;

    private SynchronizedBlockDemo() {

    }

  synchronized  public SynchronizedBlockDemo getInstance() {
        if (instance == null) {
            instance = new SynchronizedBlockDemo();
        }
        return instance;
    }


}
