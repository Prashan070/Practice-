package PracticeBasic.BasicProgram;

public class AnonymousInnerClass {



    public static void main(String[] args) {

    /* AA obj = new AA(){

        void method(){

            System.out.println("This is anonymous class method");
        }
    };
    */

        AA obj = new AA(){

            void method(){

                System.out.println("This is anonymous class method");
            }

        };

    obj.method();

    }
}

class AA{

    void method(){

        System.out.println("This is normal method");
    }


}