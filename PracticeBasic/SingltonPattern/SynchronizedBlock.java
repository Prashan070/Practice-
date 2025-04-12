package PracticeBasic.SingltonPattern;

public class SynchronizedBlock {

    private static SynchronizedBlock instance;

    private SynchronizedBlock() {

    }

   synchronized public static SynchronizedBlock getInstance() {
        if (instance == null) {
            instance = new SynchronizedBlock();
        }
        return instance;
    }


}
