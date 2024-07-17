package Ds.QueueUsingArrays;

public class Demo {
    public static void main(String[] args) {
        QueueUsingArrays q = new QueueUsingArrays();

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
