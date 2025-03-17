package PracticeBasic.DesignPatternDemo.Singlton;

public class Simpleclass {

    int  age1;
    String name;



    Simpleclass(int age1, String name){

        this.age1 = age1;
        this.name= name;
    }


    public static void main(String[] args) {
        Simpleclass simpleclass = new Simpleclass(2,"l");
    }
}
