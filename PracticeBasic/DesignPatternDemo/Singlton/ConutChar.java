package PracticeBasic.DesignPatternDemo.Singlton;


import java.util.HashMap;

class problem1{

    public void countOccurance(String name){

        HashMap<Character,Integer> h1 = new HashMap<>();
     for(char indivialChar : name.toCharArray()){

h1.put(indivialChar, h1.getOrDefault(indivialChar,0)+1);

     }

     for(char ch : h1.keySet()){
         System.out.println(ch + " - "+ h1.get(ch) );
     }



    }
}




public class ConutChar {


    public static void main(String[] args) {

                String name = "bananawttb";

                problem1 problem1 = new problem1();
                problem1.countOccurance(name);


    }





}
