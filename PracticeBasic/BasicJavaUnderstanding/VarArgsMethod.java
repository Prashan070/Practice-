package PracticeBasic.BasicJavaUnderstanding;

public class VarArgsMethod {


    public static void display(int... num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {

        VarArgsMethod.display(1,2,4,6,7,9,4);
    }
}
