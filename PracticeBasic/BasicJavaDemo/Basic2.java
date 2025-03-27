package PracticeBasic.BasicJavaDemo;

public class Basic2 {

    public static void main(String[] args) {

        String option = "2";


        switch (option) {

            case "1":
                System.out.println("11111");
                break;
            case "2":
                System.out.println("222222");
                break;
            case "3":
                System.out.println("33333");
                break;
            default:
                System.out.println("jio");
                break;
        }


        String option2 = "2";
        String end = switch (option) {
            case "1" -> "111";
            case "2" -> "222";
            case "3" -> "333";
            default -> "444";
        };

        System.out.println(end);

    }

}
