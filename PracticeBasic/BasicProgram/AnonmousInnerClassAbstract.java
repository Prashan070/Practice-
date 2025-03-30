package PracticeBasic.BasicProgram;

public class AnonmousInnerClassAbstract {


    public static void main(String[] args) {

        Demo demo = new Demo(){

            @Override
            void method() {
                System.out.println("implemented method");
            }
        };


        demo.method();


    }
}



abstract class Demo{
 abstract void   method();
}