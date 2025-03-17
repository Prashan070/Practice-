package PracticeBasic.DesignPatternDemo.Singlton;

public class Exception {
    void method1(){
        method2();
    }
    void method2(){
        method3();
    }
    void method3(){
        System.out.println(1/0);
    }


    public static void main(String[] args) {
        Exception exception = new Exception();
        exception.method1();
    }
}
