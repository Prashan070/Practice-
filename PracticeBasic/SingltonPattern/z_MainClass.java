package PracticeBasic.SingltonPattern;

public class z_MainClass {

    public static void main(String[] args) {

        a_EagerDemo insta1 = a_EagerDemo.getInstance();
        a_EagerDemo insta2 = a_EagerDemo.getInstance();


        f_enumDemo ig = f_enumDemo.INSTANCE;
        f_enumDemo ig2 = f_enumDemo.INSTANCE;

        System.out.println(ig == ig2);


    }
}
