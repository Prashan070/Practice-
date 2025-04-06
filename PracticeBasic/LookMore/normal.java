package PracticeBasic.LookMore;

class gen<T> {
    T val;

    gen(T val) {
        this.val = val;
    }


    public T retu(T num) {
        System.out.println(val);
        return num;
    }


}

public class normal {

    public static void main(String[] args) {
        gen<String> g = new gen<>("Haaaa");
        g.retu("jja");
    }

}


//Generic method
//vargs method
