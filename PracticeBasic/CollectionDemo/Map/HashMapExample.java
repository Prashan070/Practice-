package PracticeBasic.CollectionDemo.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {


    public static void main(String[] args) {


        String str = "banananana";

        HashMap<Character, Integer> hs = new HashMap<>();

       for(char ch : str.toCharArray()){
           hs.put(ch , hs.getOrDefault(ch,0)+1);
       }

        System.out.println(hs);
    }
}
