package PracticeBasic.CollectionDemo.ListDemo;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Mylinkedlist {

    Node head;

    public void add(int data) {
       Node newnode = new Node(data);

       if(head==null){
           head=newnode;
       }else{
           Node temp = head;

           while(temp.next != null){
               temp=temp.next;
           }
           temp.next=newnode;
       }
    }

    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");

    }
}


public class LinkedListDemo2 {

    public static void main(String[] args) {
        Mylinkedlist mylinkedlist = new Mylinkedlist();
        mylinkedlist.add(12);
        mylinkedlist.add(1);
        mylinkedlist.add(125);
        mylinkedlist.add(182);
mylinkedlist.add(1);
        mylinkedlist.print();

    }

}
