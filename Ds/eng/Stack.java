package Ds.eng;

public class Stack {
    public static void main(String[] args){
        java.util.Stack<String> stack =new java.util.Stack<String>();

        stack.push("abimanyu");
        stack.push("python");
        stack.push("javascript");

//        String myFavLanguage = stack.pop();
//        System.out.println(stack);
//        System.out.println(stack.peek());

        System.out.println(stack.search("python"));
        for(int i =0; i<1000000;i++){
            stack.push("kali");
            System.out.println(stack);
        }
    }
}