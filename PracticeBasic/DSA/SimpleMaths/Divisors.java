package PracticeBasic.DSA.SimpleMaths;

public class Divisors {

    public static void divisors(int num){

        int temp = (int)Math.sqrt(num);

        for(int i = 1 ; i<=temp ; i++){
            if(num%i ==0) {
                System.out.println(i);
                if (num / i != i) {
                    System.out.println(num / i);
                }
            }
        }

    }



    public static void main(String[] args) {
divisors(36);
    }
}
