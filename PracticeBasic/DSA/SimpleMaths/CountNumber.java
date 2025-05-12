package PracticeBasic.DSA.SimpleMaths;

public class CountNumber {


    public static int countnum(int num) {
        int temp = num;
        int count = 0;
        while (temp > 0) {

            int last = temp % 10;
            temp = temp / 10;
            count++;
        }
        return count;
    }

    public static void checkAmstrong(int num, int count){

        int original = num;
        int sum=0;

        while(num>0){
            int last= num%10;
            sum= sum+(int)Math.pow(last,count);
            num=num/10;
        }

        System.out.println(sum);


    }

    public static void main(String[] args) {
        int num = 371;
        int count= countnum(num);

        checkAmstrong(num,count);


    }
}
