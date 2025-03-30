package PracticeBasic.BasicProgram;

public class VarArgsMethod {

    public void arrayDisplay(Integer... num){
        for(var n : num ){
            System.out.println(n);
        }
    }



    public static void main(String[] args) {
        VarArgsMethod nt = new VarArgsMethod();
        nt.arrayDisplay(1,2,3,4,5,6);
    }
}
