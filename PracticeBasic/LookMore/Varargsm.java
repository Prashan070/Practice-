package PracticeBasic.LookMore;

import java.util.Arrays;

public class Varargsm {

    public void hhhh(int...  val){

        System.out.println(Arrays.toString(val));
    }


    public static void main(String[] args) {

        Varargsm varargsm = new Varargsm();
        varargsm.hhhh(12,276,8282,791,32);

    }



}
