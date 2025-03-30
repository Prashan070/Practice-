package PracticeBasic.DSA;

public class Program2 {


    //amstrong number

    public boolean isAmstrong(int numOriginal) {

        int num = numOriginal;
        int lenght = String.valueOf(num).length();

        int result =0;

        while(num>0){
            int last = num%10;
            result = result+ (int)Math.pow(last,lenght);
            num=num/10;

        }

        System.out.println(result);
        return numOriginal==result;
    }


    public static void main(String[] args) {

        int num=153;

        Program2 program2 = new Program2();
        System.out.println(   program2.isAmstrong(num));

    }
}
