package PracticeBasic.BasicProgram;

class Pair<U, V> {
    U first;
    V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}


public class SecondMaxNumber {

    public static Pair<Integer, Integer> secondMaxNum(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        return new Pair<>(max, secondMax);
    }


    public static void main(String[] args) {

        int[] arr = {11, 2, 6, 33, 8, 51, 76};

        System.out.println( SecondMaxNumber.secondMaxNum(arr));

    }
}
