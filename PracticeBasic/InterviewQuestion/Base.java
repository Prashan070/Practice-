package PracticeBasic.InterviewQuestion;

public class Base {

    int x = 10;

    public Base() {
        incremetx();
    }

    public void incremetx() {
        x = x + 10;      //x=20
    }

    public int returnx() {
        return x;
    }
}

class derivedclass extends Base {

    public derivedclass() {
        //super
        incremetx();
    }

    @Override
    public void incremetx() {
        x = x + 20; ///40
    }

    public static void main(String[] args) {
        Base b = new derivedclass();
        System.out.println(b.returnx());
    } ///40
}
