package Ds.DoubleLinkedList;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtBeginning(4);

        list.display();

        System.out.println(" ");
        list.displayRev();

        list.deleteAtPos(4);

        System.out.println(" ");
       //list.insertAtPos(2, 10);


        list.display();
        System.out.println(" ");
        list.displayRev();


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
