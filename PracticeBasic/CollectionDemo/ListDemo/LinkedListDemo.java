package PracticeBasic.CollectionDemo.ListDemo;


public class LinkedListDemo {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void addFirst(int data) {

        Node newNode = new Node(data);

        if(head ==null){
            head=newNode;
           return;
        }

       newNode.next= head;
        head=newNode;

    }

    public static void main(String[] args) {

        LinkedListDemo ls = new LinkedListDemo();
        ls.addFirst(12);


    }

}
