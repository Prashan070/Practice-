package PracticeBasic.BasicJavaDemo;

class basic{
    void display(){
        System.out.println("basic class");
    }
}

abstract class abclass{
     abstract   void display();
     void running(){
         System.out.println("running");
     }
}

final class fnclass{
    void finalclassmethod(){
        System.out.println("prashan");
    }
}

class normal{

    static class staticclass{
        public void dispaly(){
            System.out.println("laakaa");
        }

    }
}



/*
 * Static Class	Nested class with static keyword
 * Inner Class	Class inside another class
 * Anonymous Class	Class without a name, used inline
 * Enum Class	Used to define constant values
 */

public class Basic21 {

    public static void main(String[] args) {

        normal.staticclass j = new normal.staticclass();
        j.dispaly();

    }
}
