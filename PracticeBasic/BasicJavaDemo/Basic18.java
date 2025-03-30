package PracticeBasic.BasicJavaDemo;

public class Basic18 {

    int num;
    String name;

    Basic18(int num, String name){
     this.name=name;
     this.num=num;
        System.out.println("deaful");
    }

    Basic18(){
        this(12);
        System.out.println("hello");

    }

    Basic18(int num){
        this("prashan");
        System.out.println("Num");

    }

    Basic18(String name){
        System.out.println("Name");
    }

    public static void main(String[] args) {
        Basic18 class18 = new Basic18();
     /*   class18 class188 = new class18(12, "Prashan");
        class18 class1888 = new class18(12);
        class18 class18888 = new class18("king");
*/
    }

}

