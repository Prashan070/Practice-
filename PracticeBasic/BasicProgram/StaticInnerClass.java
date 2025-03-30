package PracticeBasic.BasicProgram;

public class StaticInnerClass {


    public static void main(String[] args) {

        A.InnerClass nc = new A.InnerClass();
        nc.method1();

    }
}

class A {

    static class InnerClass{



        void method1(){
            System.out.println("Prashan is my name");
        }

    }



}
