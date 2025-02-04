package Ds.DoubleLinkedList;


import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T> {

    Node head;
    Node tail;

    class Node {
        T data;
        Node prev;
        Node next;

        Node(T val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    DoubleLinkedList() {
        head = null;
        tail = null;

    }

    public void insertAtBeginning(T val) {
        Node newNode = new Node(val);
        newNode.next = head;
        //newNode.data  = val;

        //when list empty
        if (head == null) {
            tail = newNode;
            //tail = newNode;
        } else { //list is not empty
            head.prev = newNode;
            //newNode.next = head;
            //head = newNode;
        }
        head = newNode;

    }

    public void display() {

        if (head == null)
            System.out.println("List is empty");

        Node temp = head; // start from head
        while (temp != null) {//null implies end
            System.out.print(temp.data + " ");
            temp = temp.next;//jump
        }
    }

    public void displayRev() {
        if (head == null)
            System.out.println("List is empty");
        Node temp = tail; //start from head
        while (temp != null) { //null implies end of list
            System.out.print(temp.data + " ");
            temp = temp.prev; //jump
        }

    }

    public void insertAtPos(int pos, T val) {
        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            if (temp == null) {
                throw new IndexOutOfBoundsException("invalid Pos " + pos);
            }
        }
        //reassing pointers
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp == tail)
            tail = newNode;
        else
            temp.next.prev = newNode;
        temp.next = newNode;
    }

    public void deleteAtPos(int pos) {

        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion attempt on empty list  ");
        }
        if (pos == 0) {
            head = head.next;
            if (head == null)
                tail = null;
            else
                head.prev = null;
            return;
        }

        Node temp = head;
        Node prev = null;
        //jump till node to be deleted

        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
            if (temp == null)
                throw new IndexOutOfBoundsException("Invalid Position  ");
        }
        prev.next = temp.next;
        if (temp.next == null)
            tail = prev;
        else
            temp.next.prev = prev;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Deleting attempt on empty list");
        }
        head = head.next;
        if (head == null)
            tail = null;
        else
            head.prev = null;

    }


    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp = head;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public T next() {
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }

}
/*
insert at beginning
display
insert at any pos
delete at any pos
{generics , interface,anonymous class }
 */

















































































