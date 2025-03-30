package PracticeBasic.DSA;

import java.util.HashMap;
import java.util.Map;

public class Program6 {

    /**
     * Banana    -   B1  A3 N3
     **/


    public static void methodUsingHashMap(String name) {
        Map<Character, Integer> hp = new HashMap<>();
        for (char c : name.toCharArray()) {

            hp.put(c , hp.getOrDefault(c,0)+1);
        }
        System.out.println(hp);
    }

    public static void methodUsingNormalLoop(String name){
        int[] fre = new int[256];

        for(char ch : name.toCharArray()){
            fre[ch]++;
        }

        for(int i=0; i<256; i++){
            if(fre[i]>0){
                System.out.println((char)i + "" + fre[i]);
            }
        }





    }

    public static void main(String[] args) {


        methodUsingHashMap("BANANA");
       methodUsingNormalLoop("Banana");

    }
}
