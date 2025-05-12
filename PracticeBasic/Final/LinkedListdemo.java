/*
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

    public void addEntryInList(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;


    }

    public  void printAllEl(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
    }

}


public class LinkedListdemo {


    public static void main(String[] args) {
        LinkedListCreation ls = new LinkedListCreation();
        ls.addEntryInList(12);
        ls.addEntryInList(24);
        ls.addEntryInList(36);
        ls.addEntryInList(48);
        ls.addEntryInList(60);
        ls.addEntryInList(72);

        ls.printAllEl();



    }

}
*/
