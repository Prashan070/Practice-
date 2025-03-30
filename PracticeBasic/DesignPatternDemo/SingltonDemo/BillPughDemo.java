package PracticeBasic.DesignPatternDemo.SingltonDemo;

public class BillPughDemo {


   private  BillPughDemo(){}

    private static class  billPughDemoHelper{
        private static BillPughDemo instance = new BillPughDemo();
    }

    public static BillPughDemo getInstance(){
       return billPughDemoHelper.instance;
    }

}
class utilizationBill{
    public static void main(String[] args) {
        BillPughDemo d1 = BillPughDemo.getInstance();
        BillPughDemo d2 =BillPughDemo.getInstance();

        System.out.println(d1==d2);
    }
}
