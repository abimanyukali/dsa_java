package Ds.StackUsingLinkedList;


public class StackUsingLinkedList <T>{
    class  Node1 {
        T data;
        Node1 next;
        Node1 (T val){
            data  = val;
            next = null;
        }
    }
    Node1 top;
    StackUsingLinkedList(){
        top = null;

    }
    public void push(T val){
        Node1 newNode  = new Node1(val);
        newNode.next =top;
        top =newNode;
    }
    public T pop(){
        if(top == null)
            throw new IndexOutOfBoundsException("Stack is Empty");
        T tmp = top.data;
        top =top.next;
        return tmp;
    }
    public boolean isEmpty(){
        return top ==null;
    }
    public T peek(){
        return top.data;
    }
}
