package PracticeBasic.BasicJavaDemo;

public class Basic3 {

    public static void method1() {
        System.out.println("static method");
    }

    synchronized public void method2() {
        System.out.println("Synchronized method");
    }

    public final void method3() {
        System.out.println("prashan");
    }

    public void method4(String... arr) {
        for (var ag : arr) {
            System.out.println(ag);
        }
    }

    public <T> T method5(T val) {
        return val;
    }


}
