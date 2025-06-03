package PracticeBasic.Basic;

public class d_SwitchStatement {
    public static void main(String[] args) {
        int option = 3;

        switch (option) {
            case 1:
                System.out.println("Option one is selected");
                break;
            case 2:
                System.out.println("Option 2 is selected");
                break;
            case 3:
                System.out.println("Option 3 is selected");
                break;
            default:
                System.out.println("Default");
        }


        String result = switch (option) {
            case 1 -> "A";
            case 2 -> "B";
            case 3 -> "C";
            default -> "none";
        };
        System.out.println(result);
    }
}
