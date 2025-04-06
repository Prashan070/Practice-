package PracticeBasic.LookMore;

public class thisandsuper {

    String name;

    thisandsuper(String name) {
        System.out.println("partent class constuctor");
    }
}

class child extends thisandsuper {

    child() {
        super("prashan");
        System.out.println("this is child class constuctor");
    }
}

class kk {
    public static void main(String[] args) {
        child c = new child();
    }
}