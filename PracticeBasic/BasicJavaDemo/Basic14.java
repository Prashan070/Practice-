package PracticeBasic.BasicJavaDemo;

public class Basic14 {

    static int rollNumber;

    static final String user;

    static {
        user = "Prashan";
        System.out.println(user + rollNumber);


    }

    {
        System.out.println("Instance block");
    }

    Basic14(){
        System.out.println("Consuctor");
    }

    public static void method1() {

        System.out.println("Prashan method");
    }



    public static void main(String[] args) {

        method1();
        Basic14 basic14 = new Basic14();


//static --block,method,variable,class (//nested clASS),constuctor





    }
}
