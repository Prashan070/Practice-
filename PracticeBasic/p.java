package PracticeBasic;

class Parent {
    int x = 10;

    public Parent() {
        System.out.println("Parent constructor: x = " + x);
        printX();
    }

    public void printX() {
        System.out.println("Parent printX: x = " + x);
    }
}

class Child extends Parent {
    int x = 20;

    public Child() {
        System.out.println("Child constructor: x = " + x);
    }

    @Override
    public void printX() {
        System.out.println("Child printX: x = " + x);
    }

    public static void main(String[] args) {
        Parent p = new Child();
    }
}
