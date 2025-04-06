package PracticeBasic.BasicJavaDemo;


public  class Basic1 {


    public <T, K> K anyValue(T value, K value2){

        System.out.println("inside the method" + value);
        System.out.println("inside the method" + value2);

        return value2;
    }


    public static void main(String[] args) {

        Basic1 c1 = new Basic1();
        c1.anyValue(123,"pika");
        c1.anyValue("prashan",123);
        c1.anyValue(true,123);

    }
}


