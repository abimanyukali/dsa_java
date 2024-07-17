package Ds.eng;

import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {
 public static void main(String[] args){
     Queue<String> queue =new LinkedList<String>();
//enqueue = offer()
//dequeue = poll ()

     queue.offer("abimanyu");
     queue.offer("kali");
     queue.offer("maya");
     queue.offer("dhoni");

System.out.println(queue.size());
System.out.println(queue.contains("dhoni"));
//     System.out.println(queue.peek());
     queue.poll();
     queue.poll();
     queue.poll();
     queue.poll();
     queue.poll();

     System.out.println(queue.isEmpty());
System.out.println((queue));

 }
}
