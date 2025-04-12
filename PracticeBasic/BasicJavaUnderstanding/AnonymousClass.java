package PracticeBasic.BasicJavaUnderstanding;

@FunctionalInterface
interface A {
    public void dispaly();
}

/*class B implements A {

    @Override
    public void dispaly() {
        System.out.println("hELLO WORLD");
    }
}*/


public class AnonymousClass {

    public static void main(String[] args) {

/*
        A obj = new A() {

            public void dispaly() {
                System.out.println("hELLO WORLD");
            }
*/


        A obj = () -> System.out.println("hELLO WORLD");
        obj.dispaly();
    }


}




