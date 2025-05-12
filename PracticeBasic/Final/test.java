package PracticeBasic.Final;


public class test {

    int x = 10;

    public test() {

        incremetx();
    }

    public void incremetx() {    //x=20
        x = x + 10;
    }

    public int returnx() {
        return x;
    }
}

class derivedclass extends test {

    public derivedclass() {
        incremetx();
    }

    @Override
    public void incremetx() {    //30
        x = x + 20;
    }

    public static void main(String[] args) {
        test b = new derivedclass();
        System.out.println(b.returnx());
    }
}

