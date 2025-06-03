package PracticeBasic.Basic;

//Palindrome no

public class h_ReverseNumber {

    public static void reverseNumberMethod(int num) {
        int result = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            result = result * 10 + lastdigit;
            num = num / 10;
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        reverseNumberMethod(897);
    }
}


