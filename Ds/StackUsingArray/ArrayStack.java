package Ds.StackUsingArray;

public class ArrayStack <T> {
    static final int MAX_SIZE = 30;
    T arr[] = (T[])new Object[MAX_SIZE];
    int top;

    ArrayStack() {
        top = -1;

    }

    void push(T val) {
//        top ++;
//        arr[top] = val;
        if (top == MAX_SIZE)
            throw new IndexOutOfBoundsException("Stack is overflow ");
        arr[++top] = val;
    }

    T pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("stack is underflow");
        }

        return arr[top--];
    }
    T peek(){
        return arr[top];
    }
    boolean isEmpty(){
        return top == -1;
    }
}
