package PracticeBasic.Final;

import java.net.FileNameMap;

public abstract class AbstractClassDemo {

    //abstact method
    abstract void method1();

    //concrete method
    public  void concretemethod(){
        System.out.println("Prashan");
    }

    public static void staticmethod(){
        System.out.println("Static method");
    }

    public final void display(){
        System.out.println("Final method");
    }

    AbstractClassDemo(){
        System.out.println("Prashan");
    }

    int age;

    static String name;

    final int num =100;


}


