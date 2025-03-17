package PracticeBasic.DesignPatternDemo.Singlton;

public class bill2 {



    private bill2(){

    }

    private static class billheper{
        private static final bill2 instance = new bill2();
    }


    public bill2 getinstance(){
        return billheper.instance;
    }

    String name = new String("Prashan");


    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("heelo");

    }
}
