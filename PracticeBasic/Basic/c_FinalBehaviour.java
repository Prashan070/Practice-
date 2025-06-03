package PracticeBasic.Basic;

public class c_FinalBehaviour {

    private final int password;

    public c_FinalBehaviour(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public static void main(String[] args) {

        c_FinalBehaviour cFinalBehaviour = new c_FinalBehaviour(123);
        System.out.println(cFinalBehaviour.getPassword());

    }
}
