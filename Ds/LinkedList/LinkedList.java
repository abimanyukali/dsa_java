package Ds.LinkedList;


import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    Node head;

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    LinkedList() {
        head = null;

    }

    public void insertAtBeginning(T val) {
        Node newNode = new Node(val);
        //newNode.data  = val;

        //when list empty
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node temp = head; // start from head
        while (temp != null) {//null implies end
            System.out.print(temp.data + " ");
            temp = temp.next;//jump
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

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPos(int pos) {

        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion attempt on empty list  ");
        }
        if (pos == 0) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;
        Node prev = null;
        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Deleting attempt on empty list");
        }
        head = head.next;

    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
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
get (pos)  - get (2)
update (pos,val)
deleteAtEnd
insertAnEnd(val)
search(val) -return index, -1;
contains(val) - return true or false
length



{generics , interface,anonymous class }
 */

















































































