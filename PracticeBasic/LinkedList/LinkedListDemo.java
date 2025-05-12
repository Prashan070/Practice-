package PracticeBasic.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {

    Node head;


    public void add(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;

        }
    }


    public void display() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            System.out.print(temp.data + "->");
            count++;
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println(count);


    }

    public void deleteHead() {
        Node temp =  head;
        head= temp.next;
    }


}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(19);
        l1.add(12);
        l1.add(190);
        l1.add(120);


        l1.display();
        l1.deleteHead();
        l1.display();
    }
}
