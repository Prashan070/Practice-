package PracticeBasic.BasicJavaDemo;

public class Basic7 {

    int num;
    Long rollnumber;
    String name;
    Boolean isAvaiable;

   private  Basic7(int num, Long rollnumber, String name, Boolean isAvaiable) {
        this.num = num;
        this.rollnumber = rollnumber;
        this.name = name;
        this.isAvaiable = isAvaiable;
    }

    @Override
    public String toString() {
        return "Basic7{" +
                "num=" + num +
                ", rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                ", isAvaiable=" + isAvaiable +
                '}';
    }

}

//Cannot create a class out of that class
//cannot extended that class which contain private constructor

/*class Basic7demo{
    public static void main(String[] args) {
        Basic7 basic7 = new Basic7();


    }*/

/*class Basic7demoA extends Basic7{

    int roll;

*//*
  Basic7demoA(int roll){
      this.roll=roll;
  }
*//*

    public static void main(String[] args) {

    }
    }*/

