package PracticeBasic.Basic;

public class i_CopyConstuctor {

    String name;
    int age;

    i_CopyConstuctor(String name, int age){
        this.name=name;
        this.age=age;
    }

    i_CopyConstuctor(i_CopyConstuctor ob){
        this.name= ob.name;
        this.age=ob.age;
    }

    @Override
    public String toString() {
        return "i_CopyConstuctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        i_CopyConstuctor iCopyConstuctor = new i_CopyConstuctor("Ali", 25);
        i_CopyConstuctor iCopyConstuctor1 = new i_CopyConstuctor(iCopyConstuctor);

        System.out.println(iCopyConstuctor);
        iCopyConstuctor.age=100;
        System.out.println(iCopyConstuctor);
        System.out.println(iCopyConstuctor1);

    }
}
