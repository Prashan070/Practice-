package PracticeBasic.Final;


class genericEx<T> {
    T val;

    public void setVal(T val){
        this.val=val;
    }

    public T getVal(){
        return val;
    }
}




public class WorldHello {

    public static void main(String[] args) {

        genericEx<Integer> intexmample =  new genericEx<>();
        intexmample.setVal(12);
        System.out.println(intexmample.getVal());

        genericEx<String> stringExp = new genericEx<>();


    }



}
