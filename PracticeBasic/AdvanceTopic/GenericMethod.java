package PracticeBasic.AdvanceTopic;

public class GenericMethod {

    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        printArray(new Integer[]{1, 2, 3});
        printArray(new String[]{"a","b","c"});
    }
}
