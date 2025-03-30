/*
package PracticeBasic.BasicProgram;


class OuterClass {

    int var1;
    static int var2;

    void methodOtherClass() {
        System.out.println(var1 + "" + var2);
    }

    static {
        System.out.println("Outer static block");
    }



   static class InnnerStaticCLASS{

        static {
            System.out.println("Inner static clas");
        }

        static void display(){
            System.out.println("Inner static class"+ var2);
        }

    }

    class InnerClassNonStatic{

        static {
            System.out.println("helo");
        }

      static   void displayQ(){
            System.out.println("Inner no static class");
        }

    }


}



public class Bisic15 {


    public static void main(String[] args) {

       // OuterClass.InnnerStaticCLASS.display();

        OuterClass oc = new OuterClass();
        oc.methodOtherClass();

        OuterClass.InnerClassNonStatic b = oc.new InnerClassNonStatic();
        OuterClass.InnerClassNonStatic.displayQ();

    }
}


*/
