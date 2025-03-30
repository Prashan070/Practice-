package PracticeBasic.DesignPatternDemo.SingltonDemo;

public enum EnumDemo {

    INSTANCE;



}

class utilizationEnum {
    public static void main(String[] args) {
        Enum e1 = EnumDemo.INSTANCE;
        Enum e2=EnumDemo.INSTANCE;
    }
}