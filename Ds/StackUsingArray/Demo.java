package Ds.StackUsingArray;


public class Demo {
    public static void main(String[] args){
        ArrayStack <String> stack = new ArrayStack<String>();

        boolean isEmpty = stack.isEmpty();
        System.out.println("is Empty "+ isEmpty);

        stack.push("abi");
        stack.push("kali");
        stack.push("root");
        System.out.println("popped "+ stack.pop());

       String data = stack.peek();
       System.out.println("peek data " +data);

       boolean isEmpty1 = stack.isEmpty();
       System.out.println("is Empty1 " +isEmpty1);
    }
}
