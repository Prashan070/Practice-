package PracticeBasic.BasicProgram;

public class NonStaticNestedClassInnerclass {


    public static void main(String[] args) {


        B ol = new B();
        B.nonStaticNestedClass j = ol.new nonStaticNestedClass();

    }
}


class B {

    class nonStaticNestedClass {

        static {
            System.out.println("test");
        }

        void method1() {
            System.out.println("Prashannnn");
        }


    }


}
