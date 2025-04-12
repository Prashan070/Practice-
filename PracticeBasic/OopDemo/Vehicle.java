package PracticeBasic.OopDemo;

 public abstract class Vehicle {
     private String brand; ///encapsulation

     public abstract void start();

     public void setBrand(String brand){
         this.brand=brand;
     }

     public String getBrand(){
         return brand;
     }

     Vehicle(String brand){
         this.brand=brand;
     }

}

class Car extends Vehicle{

     Car(String brand){
      super("BMW");
     }

    @Override
    public void start() {
        System.out.println( getBrand() + " IS STARTING");
    }
}

class Myfactory{
    public static void main(String[] args) {

        Vehicle c1 = new Car("Suzuki");
        c1.start();
    }
}