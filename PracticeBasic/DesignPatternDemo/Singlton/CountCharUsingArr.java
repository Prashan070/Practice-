package PracticeBasic.DesignPatternDemo.Singlton;

class problem2{
    public void countOccurance2(String name){

        int[] arr = new int[255];

        for(char ch : name.toCharArray()){
            arr[ch]++;
        }
        for(int i=0;i<255; i++){
            if(arr[i]>0){
                System.out.println((char) i + " - "+ arr[i]);
            }
        }

    }

}



public class CountCharUsingArr {
    public static void main(String[] args) {
        String name = "bananawttb";

        problem2 problem2 = new problem2();
        problem2.countOccurance2(name);

    }
}
