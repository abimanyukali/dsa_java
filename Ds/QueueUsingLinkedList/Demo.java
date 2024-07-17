package Ds.QueueUsingLinkedList;

public class Demo {
    public static void main(String[ ] args ){
        QueueUsingLL q  =new  QueueUsingLL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("dequeued" + q.dequeue());
        System.out.println("dequeued" + q.dequeue());
        System.out.println("dequeued" + q.dequeue());

        //System.out.println("dequeued" + q.dequeue());

        q.enqueue(4);
        q.enqueue(5);

        System.out.println("dequeued" + q.dequeue());
        System.out.println("dequeued" + q.dequeue());
    }
}
