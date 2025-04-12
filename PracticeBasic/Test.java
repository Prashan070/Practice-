package PracticeBasic;

//enum
//generic
//varargs
//string buffer and builder
//iner class, non static class
//anymous class
//default method



abstract class Test {

    abstract void display();

    void display2() {
        System.out.println("concrete method");
    }

    static void dispay3() {
        System.out.println("This is static method");
    }

    final void display4() {
        System.out.println("this is final method");
    }

    int age;
    static String passowrd;
    static final String id = "K";

    Test(){

    }

    Test(int age) {
        this.age = age;
    }

    static {
        passowrd = "abe";
    }

    {
        System.out.println("jo");
    }

    private void metho4(){
        System.out.println("kkk");
    }
}
class king extends Test{

    king(int age) {
        super(age);
    }

    @Override
    void display() {
        System.out.println("jio");
    }
}



