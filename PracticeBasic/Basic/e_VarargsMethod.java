package PracticeBasic.Basic;

public class e_VarargsMethod {

    public static int[] display(int... num){
        for(int nums : num){
            System.out.println(nums);
        }
        return num;
    }


    public static void main(String[] args) {

        display(1,44,9,27,7);

    }
}
