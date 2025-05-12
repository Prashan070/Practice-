package PracticeBasic.Final;

class Node {

    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }

}


class LinkedListCreation {

    Node head;

    public void add(int data) {

        Node n1 = new Node(data);

        if (head == null) {
            head = n1;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next=n1;

    }

    public void display(){

        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

}

public class LinkedListDemo2 {

    public static void main(String[] args) {
        LinkedListCreation l1 = new LinkedListCreation();
        l1.add(123);
        l1.add(98);
        l1.add(3);
        l1.add(13);
        l1.add(111);

        l1.display();


    }
}
