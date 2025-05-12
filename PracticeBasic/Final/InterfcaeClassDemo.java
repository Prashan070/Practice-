package PracticeBasic.Final;

 interface ClassA {

     void display();

}

interface ClassB {

    void display();

}

interface ClassC {
     default void display(){
         System.out.println("Prashan");
     }
}



public class InterfcaeClassDemo{


    public static void main(String[] args) {



    }
}