package PracticeBasic;

abstract public class OuterAbstract {

    class A {
        void display() {
            System.out.println("non static inner clas");
        }
    }

    static class B {
        void display() {
            System.out.println("static inner class");
        }
    }

}

class Demo extends OuterAbstract {

    public static void main(String[] args) {

        Demo d = new Demo();

        OuterAbstract.A obj1 = d.new A();


        OuterAbstract.B obj2 = new B();

    }

}