package Ds.QueueUsingLinkedList;

public class QueueUsingLL {
    Node front, rear;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;

        }
    }

    QueueUsingLL() {
        front = null;
        rear = null;
    }


    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (front == null)
            front = newNode;

        else
            rear.next = newNode;
        rear = newNode;

    }

    public int dequeue() {
        if (front == null)
            throw new IndexOutOfBoundsException("Queue is Empty");
        int data = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return data;
    }
}
