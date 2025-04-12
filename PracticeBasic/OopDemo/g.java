package PracticeBasic.OopDemo;

class Parent {


    void show() {
        System.out.println("Parent show");
    }


}

class Child extends Parent {

    @Override
    void show() {
        System.out.println("Child show");
    }

    void onlyInChild() {
        System.out.println("Child-only method");
    }
}

public class g {
    public static void main(String[] args) {

        Parent obj = new Child();
        obj.show();         // ?
       // obj.onlyInChild();  // Error?
    }
}
