package PracticeBasic.DSA;

public class Program4 {


    //divisor

    public void allDivisor(int num) {

        int n = (int) Math.sqrt(num);

        for (int i = 1; i <= n; i++) {
            if (num % i == 0) {
                System.out.println(i);
                if (i != num / i) {
                    System.out.println(num / i);
                }
            }
        }


    }

    public static void main(String[] args) {

        int num = 36;
        Program4 program4 = new Program4();
        program4.allDivisor(num);

    }
}

/*
1*36
2*18
3*12
4*9
6*6*/
