package PracticeBasic.BasicJavaDemo;

class Parent{

     String name;

    Parent(){
        System.out.println("This is parent constuctor " + name);
    }

    Parent(String name){
        System.out.println("This is parent constuctor " + name);
    }

}
class Child extends Parent{



    Child(){
        System.out.println("This is child constuctor");

    }


}


public class Basic19 {

    public static void main(String[] args) {
        Parent ch = new Child();
    }
}
