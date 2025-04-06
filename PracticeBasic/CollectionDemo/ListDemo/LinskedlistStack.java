/*
package PracticeBasic.CollectionDemo.ListDemo;

public class LinskedlistStack {
    public static void main(String[] args) {

    }
}
class Stack {
    private Node top; // head of the linked list

    // Push to top
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top; // new node points to old top
        top = newNode;      // new node becomes top
    }

    // Pop from top
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        int popped = top.data;
        top = top.next; // move top down
        return popped;
    }

    // Peek at top element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return top.data;
    }

    // Check if empty
    public boolean isEmpty() {
        return top == null;
    }

    // Print stack
    public void printStack() {
        Node current = top;
        System.out.print("Top -> ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
*/
