package PracticeBasic.CollectionDemo.ListDemo;

public class LinkedListqueue {
    public static void main(String[] args) {

    }
}
class Queue {
    private Node front, rear;

    // Enqueue: Add to rear
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) { // first element
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue: Remove from front
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }

        int value = front.data;
        front = front.next;

        if (front == null) { // queue became empty
            rear = null;
        }

        return value;
    }

    // Peek front
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        return front.data;
    }

    // Check empty
    public boolean isEmpty() {
        return front == null;
    }

    // Print queue
    public void printQueue() {
        Node current = front;
        System.out.print("Front -> ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

