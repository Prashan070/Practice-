package PracticeBasic.SingltonPattern;

public class BillPugh {

    private BillPugh(){

    }

    private static class BillPughHelperClass {
        private static final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance(){
        return BillPughHelperClass.instance;
    }

}
