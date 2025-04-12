package PracticeBasic.BasicJavaUnderstanding;

public class StringBufferBuilder {

    public static void main(String[] args) {


        StringBuffer name = new StringBuffer("Hello");
        name.append(" Kumar");
        System.out.println(name);



        StringBuffer sb1 = new StringBuffer("Prashan");
        StringBuffer sb2 = new StringBuffer("Prashan");
        String sb3 = "Prashan";
        String sb4 = "Prashan";


        System.out.println(sb1 == sb2); //false
        System.out.println(sb3 == sb4); //true

        System.out.println(sb1.equals(sb2));  //false
        System.out.println(sb3.equals(sb4));  //true

       // System.out.println(sb1==sb3); !Error because both are different
        System.out.println(sb1.equals(sb3));


    }

}
