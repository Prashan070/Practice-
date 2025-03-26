package PracticeBasic.BasicJavaDemo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class BasicFivePart2 {


    public static void main(String[] args) {


/*
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date joiningDateEmp1 = simpleDateFormat.parse("01-08-1220");
        Date joiningDateEmp2 = simpleDateFormat.parse("01-08-1220");
        Date joiningDateEmp3 = simpleDateFormat.parse("01-08-1220");
*/



        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate joiningDateEmp1 = LocalDate.parse("01-08-1220",dateTimeFormatter);
        LocalDate joiningDateEmp2 = LocalDate.parse("01-08-1220",dateTimeFormatter);
        LocalDate joiningDateEmp3 = LocalDate.parse("01-08-1220",dateTimeFormatter);


        ArrayList<BasicFive> ar = new ArrayList<>();
        ar.add(new BasicFive(1,"preshrankA", joiningDateEmp1));
        ar.add(new BasicFive(2,"phantasma", joiningDateEmp2));
        ar.add(new BasicFive(3,"preshrank", joiningDateEmp3));

        System.out.println(ar);




    }
}
