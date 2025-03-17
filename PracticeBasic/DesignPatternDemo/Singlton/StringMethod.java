package PracticeBasic.DesignPatternDemo.Singlton;


import java.util.Arrays;

public class StringMethod {

    public void printchar(String name){
        for(int i=0 ; i< name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }



    public static void main(String[] args) {
        StringMethod stringMethod = new StringMethod();
        stringMethod.printchar("prashan");

        String na = "Prashan";
        char[] a = na.toCharArray();
        System.out.println(Arrays.toString(a));


    }
}
