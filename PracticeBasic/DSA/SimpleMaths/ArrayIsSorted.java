package PracticeBasic.DSA.SimpleMaths;

public class ArrayIsSorted {

    public static boolean checkArray(int[] array) {

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        int array[] = {1, 7, 3, 4, 5};

        System.out.println(checkArray(array));

    }
}
