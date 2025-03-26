package PracticeBasic.BasicJavaDemo;

public class BasicThree {


    public static void method1() {
        System.out.println("Static method");
    }

    public final void method2() {
        System.out.println("final method");
    }

    //method3 Abstract method

    //Synchronized method
    synchronized public void method4() {
        System.out.println("synchronized method");
    }

    //Generic method

    public <T> T method5(T data) {
        return data;
    }


    //Varargs Method
    public void method6(int... num) {
        int n = num.length;

        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }


    public static void main(String[] args) {


        method1();
        BasicThree basicThree =new BasicThree();
        basicThree.method5("Prashan");
        basicThree.method5(1234);
        basicThree.method5(true);

        basicThree.method6(1,2,4,5,7,8,9);


    }
}
