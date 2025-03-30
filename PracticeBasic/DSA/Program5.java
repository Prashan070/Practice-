package PracticeBasic.DSA;

import PracticeBasic.BasicJavaDemo.Basic11;

public class Program5 {

    //prime number

    public boolean isPrimeNumer(int num) {

        int count = 0;

        int n = (int) Math.sqrt(num);


        for (int i = 1; i <= n; i++) {

            if (num % i == 0) {
                count++;
                System.out.println("inside " + i);
                if (i != num / i) {
                    count++;
                    System.out.println("outside " + i);
                }

            }
        }

        System.out.println(count);
        return count == 2 ? true : false;
    }


    public static void main(String[] args) {

        Program5 program5 = new Program5();
        System.out.println(program5.isPrimeNumer(29));
    }


}
