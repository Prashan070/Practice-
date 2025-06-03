package PracticeBasic.SingltonPattern;

public class d_doublechecked {

    private static volatile d_doublechecked instance;

    private d_doublechecked() {

    }

    public static d_doublechecked getInstance() {
        if (instance == null) {

            synchronized (d_doublechecked.class) {

                if (instance == null) {
                    instance = new d_doublechecked();
                }
            }
        }
        return instance;
    }
}
