package PracticeBasic.BasicJavaUnderstanding;

public abstract class AllTypeOfMethod {

    public void display() {
        System.out.println("Normal method");
    }

    public static void display2() {
        System.out.println("Static method");
    }

    public final void display3() {
        System.out.println("Final method");
    }

    synchronized public void display4() {
        System.out.println("Synchronized method");
    }

    abstract public void dipslay5();

    public <T> T dispaly6(T value) {
        return value;
    }

    public void display7(int... arrNum) {
        for (int arr : arrNum) {
            System.out.println(arr);
        }
    }


    public static void main(String[] args) {

    }
}
