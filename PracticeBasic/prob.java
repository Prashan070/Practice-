package PracticeBasic;

interface prob {
    void dis();
}

interface gfg extends prob {
    default void dis() {
        System.out.println("override by gfg");
    }
}

interface gfg2 extends prob {
    default void dis() {
        System.out.println("overide by gfg2");
    }
}
class A implements gfg, gfg2{

    @Override
    public void dis() {
       // System.out.println("hahahha");
        gfg.super.dis();
    }
}

class f {
    public static void main(String[] args) {
        A a = new A();
        a.dis();
    }
}