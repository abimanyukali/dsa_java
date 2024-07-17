package Ds.StackUsingLinkedList;

public class Demo {
    public static void main(String[] args) {
        StackUsingLinkedList<Integer> S = new StackUsingLinkedList<Integer>();

        boolean bool = S.isEmpty();
        System.out.println("boolean " + bool);

        S.push(3);
        S.push(4);
        S.push(5);
        System.out.println("popped " + S.pop());


        Integer data = S.peek();
        System.out.println("peek " + data);

        boolean bool1 = S.isEmpty();
        System.out.println("boolean " + bool1);
    }
}
