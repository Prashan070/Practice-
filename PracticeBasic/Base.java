package PracticeBasic;

public class Base {

    int x = 10;

    public Base() {

        incremetx();
    }

    public void incremetx() {
        x = x + 10;      //20
    }

    public int returnx() {
        return x;
    }
}

class derivedclass extends Base {

    public derivedclass() {
        incremetx();
    }

    @Override
    public void incremetx() {
        x = x + 20;
    }

    public static void main(String[] args) {
        Base b = new derivedclass();
        System.out.println(b.returnx());
    }
}

