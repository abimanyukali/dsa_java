package Ds.CircularLinkedList;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        CircularLinkedList<String> list = new CircularLinkedList<String>();

        list.insertAtBeginning("first");
//        list.insertAtBeginning("second");
//        list.insertAtBeginning("thred");
//        list.insertAtBeginning("fourth");

        list.display();

//        String data = list.deleteAtBeginning();
//        System.out.println("\n delete data  " +data);
        list.deleteAtEnd();
        System.out.println("\n display data ");
        list.display();

//        System.out.println(" ");
//        list.displayRev();
//
//        list.deleteAtPos(4);
//
//        System.out.println(" ");
        //list.insertAtPos(2, 10);


//        list.display();
//        System.out.println(" ");
//        list.displayRev();


//        System.out.println(" ");
//        list.insertAtPos(3, 10);
//        list.display();

//        list.reverse();
//        System.out.println(" ");
//        list.display();

//        System.out.println(" ");
//        list.deleteAtPos(0);
//
//        list.display();
//        System.out.println(" ");
//
//        for (int a : list)
//            System.out.print(a + " ");
//        Iterator<Integer> it = list.iterator();
//
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}
