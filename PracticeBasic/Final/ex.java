package PracticeBasic.Final;

class CustomeEx extends RuntimeException {
    CustomeEx(String message) {
        super(message);
    }

}


class eligiable {
    public static void checkEligiable(int age) {
        if (age < 18) {
            throw new CustomeEx("not elliable for voting");
        }
    }
}


class ex {


    public static void main(String[] args) {

        eligiable.checkEligiable(12);

    }
}