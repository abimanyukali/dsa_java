package Ds.LinkedList;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.insertAtBeginning(1);

        list.display();
//        list.insertAtBeginning(5);
//        list.insertAtBeginning(1);
//        list.display();


//        System.out.println(" ");
//        list.insertAtPos(3, 10);
//        list.display();

        list.reverse();
        System.out.println(" ");
        list.display();

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
