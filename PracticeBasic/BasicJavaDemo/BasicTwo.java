package PracticeBasic.BasicJavaDemo;







public class BasicTwo {

    //if you make variable as static final you have to initialize it
   static final int age;

   static {
       age=18;
   }

    public BasicTwo() {
    }

    public static void main(String[] args) {
        BasicTwo basicTwo= new BasicTwo();
    }
}
