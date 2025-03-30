package PracticeBasic.BasicProgram;

import java.util.Arrays;

public class ReturningArray {

    public int[] method(){
        int a=0;
        int b=0;

        return new int[]{a,b};
    }


    public static void main(String[] args) {
        ReturningArray basic12 = new ReturningArray();
        System.out.println(Arrays.toString(basic12.method()));
    }
}

