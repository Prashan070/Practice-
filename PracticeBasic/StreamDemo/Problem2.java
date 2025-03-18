package PracticeBasic.StreamDemo;

//List of number
//we have to find sum of square of even no.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {


    public static void squareOfNumberWithoutStream(List<Integer> ls){

        int sum =0;

        for(int i=0; i<ls.size(); i++){
            if(ls.get(i) %2 ==0){
                int sqaure = ls.get(i);
                sum=sum+sqaure;
            }
        }

        System.out.println(sum);
    }

    public static void squareOfNumberStream(List<Integer> ls){




    }


    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        squareOfNumberWithoutStream(ls);
    }

}
