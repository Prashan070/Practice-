package PracticeBasic;

public class Test<T,K> {


    public  T method1(T val1, K Val2){
        return val1;
    }


    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("Prashn");
        sb1.append(" kumar");
        System.out.println(sb1);

        Test<Integer,String> j = new Test<>();



        System.out.println();
    }


}
