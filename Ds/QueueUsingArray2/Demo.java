package Ds.QueueUsingArray2;

public class Demo {
    public static void main(String[] args) {
        QueueUsingArrays2 q = new QueueUsingArrays2();

        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(9);
        //  q.enqueue(10);

        System.out.println("dequeued " + q.dequeue());
        System.out.println("dequeued " + q.dequeue());
        System.out.println("dequeued " + q.dequeue());
        //System.out.println("dequeued "+ q.dequeue());


        q.enqueue(8);
        q.enqueue(9);


        System.out.println("dequeued " + q.dequeue());
        System.out.println("dequeued " + q.dequeue());

//        System.out.println("dequeued " + q.dequeue());

    }
}
