/*
package PracticeBasic.CollectionDemo.ListDemo;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//1,2,4,6
//H

class MyLinkedList {

    Node head;

    public void add(int data) {

        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=newnode;

        }
    }


    public void print(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}




public class LinkedListDemo {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(12);
        myLinkedList.add(22);
        myLinkedList.add(222);
        myLinkedList.add(211112);
        myLinkedList.add(262);

        myLinkedList.print();

    }

}
*/
