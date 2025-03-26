package PracticeBasic.BasicJavaDemo;

abstract class BasicFour {

   abstract void method3();


}

class BasicFourImpl extends BasicFour{

    @Override
    void method3() {
        System.out.println("Abstract method");
    }

    public static void main(String[] args) {
        BasicFour basicFour = new BasicFourImpl();
        basicFour.method3();
    }
}