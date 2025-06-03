package PracticeBasic.AdvanceTopic;

public class GenericClassDemo<T> {

   private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }



    public static void main(String[] args) {

        GenericClassDemo<Integer> d1 = new GenericClassDemo<>();
        d1.setItem(12);
        GenericClassDemo<String> d2 = new GenericClassDemo<>();
        d2.setItem("Prashan");


    }
}
