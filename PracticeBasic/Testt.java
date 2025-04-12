package PracticeBasic;

interface Diamond {
    default void display() {
        System.out.println("Diamond");
    }
}

class Gold {
    void display(){
        System.out.println("alalla");
    }
}

class C extends Gold implements Diamond {

    @Override
    public void display() {
        Diamond.super.display();
    }
}

public class Testt {
    public static void main(String[] args) {
        C c = new C();
        c.display();  // Output: alalla
    }
}
