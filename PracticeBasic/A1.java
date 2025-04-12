package PracticeBasic;

interface A1 {

    void d1();
}

interface B1 extends A1 {

    default void d1() {
        System.out.println("Aaaaaaa");
    }
}

interface C1 extends A1 {

    @Override
    default void d1() {
        System.out.println("BBBBBBB");
    }
}

class D implements B1, C1 {

    @Override
    public void d1() {
     // System.out.println("Class D's implementation of d1()");
        B1.super.d1();

    }


    public static void main(String[] args) {
        A1 d = new D();
        d.d1();
    }
}

