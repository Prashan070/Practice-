package PracticeBasic.BasicJavaUnderstanding;

import java.util.Arrays;

public class GenericClass<T, V> {

    T value1;
    V value2;

    public GenericClass(T value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "GenericClass{" + "value1=" + value1 + ", value2=" + value2 + '}';
    }


    public void display() {
        System.out.println(value1 + " " + value2);
    }

    public <T> void printarr(T[] arr){
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {

        GenericClass<String, Integer> s1 = new GenericClass<>("Prashan", 1);
        GenericClass<String, Integer> s2 = new GenericClass<>("Shrey", 2);

        s1.display();
        s2.display();


        Integer[] arrr = {1,2,3,4,5,6,7};
        String[] t = {"Prashan", "Is", "Myname"};
        s1.printarr(arrr);
        s1.printarr(t);

    }

}
