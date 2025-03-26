package PracticeBasic.CollectionDemo.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {





    public static void main(String[] args) {

        HashMap<Integer, String> hp = new HashMap<>();
        hp.put(1,"Dog");
        hp.putIfAbsent(1,"Lion");
        hp.put(2,"Tiger");
        hp.put(3,"Monkey");
        hp.putIfAbsent(4,"Cat");

        System.out.println(hp.entrySet());
        System.out.println(hp.keySet());
        System.out.println(hp.values());


        System.out.println("**************************");

        //iterate through key in a map

        for(Integer i : hp.keySet()){
            System.out.println(hp.get(i));
        }

        System.out.println("****************************");
        System.out.println("****************************");

        //iterate through value in a map

        for(String i : hp.values()){
            System.out.println(i);
        }

        System.out.println("****************************");

        System.out.println("****************************");

        //iterate through value in a map

        for(var i : hp.values()){
            System.out.println(i);
        }

        System.out.println("****************************");

        for(Map.Entry<Integer,String> entry : hp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



        System.out.println(hp.get(4));

        System.out.println(hp.containsKey(1));
        System.out.println(hp.containsValue("Cat"));



    }
}
