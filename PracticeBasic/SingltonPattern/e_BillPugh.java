package PracticeBasic.SingltonPattern;

public class e_BillPugh {


    private e_BillPugh(){}

    private static class helper{
        private static e_BillPugh Instance = new e_BillPugh();

    }

    public static e_BillPugh getInstance(){
        return helper.Instance;
    }

}
