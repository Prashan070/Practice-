package PracticeBasic.BasicJavaUnderstanding;

public class SwitchStatemenet {
    public static void main(String[] args) {

        int option=3;

        switch(option){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("World");
                break;
            case 3:
                System.out.println("!");
                break;
            default:
                System.out.println("Nothing found");
        }


        int otherOption=2;

        String result=switch (otherOption){
            case 1 -> "hello";
            case 2 -> "world";
            default -> "Nothing found";
        };

        System.out.println(result);

    }
}
