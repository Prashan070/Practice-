package PracticeBasic.StreamDemo;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicStream {

    public static void basicStreamCreation(){

        int[] numsPri = {1,44,6,7,9};

        //primitive Type array
       IntStream streamObj=  Arrays.stream(numsPri);
       streamObj.forEach(System.out::println);


      //Object type
        Integer[] arr ={7,2,4,1,2};
        Stream<Integer> objStream = Stream.of(arr);
        objStream.forEach(System.out::println);

    }

    public static void main(String[] args) {
        basicStreamCreation();

    }
}
