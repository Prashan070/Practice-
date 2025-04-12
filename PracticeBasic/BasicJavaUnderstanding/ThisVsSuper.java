package PracticeBasic.BasicJavaUnderstanding;

class Parent{

    Parent(String name){
        System.out.println("Parent constuctor");
    }


}




public class ThisVsSuper extends Parent {


    ThisVsSuper() {
        this(10);
        System.out.println("Hello3");
    }

    ThisVsSuper(int num) {
        this(10, 10);
        System.out.println("Hello2");
    }

    ThisVsSuper(int num, int num2) {
        super("Prashan");
        System.out.println("Hello1");
    }


    int num1 = 10;
    int num2 = 100;

    public void display() {
        System.out.println(this.num1 + " " + this.num2);
    }


    public static void main(String[] args) {

        ThisVsSuper ts = new ThisVsSuper();
        ts.display();


    }

}
