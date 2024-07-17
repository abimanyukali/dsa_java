package Ds.Array;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        int val, pos, index ,searchValue ,searchArray ;
        TestDynamicArray list = new TestDynamicArray();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.insert at end position\n");
            System.out.println("2.Display the lis \n");
            System.out.println("3.Insert at any position\n");
            System.out.println("4.Delete at specified position \n");
            System.out.println("5:Array  of length: \n");
            System.out.println("6: Array delete At end \n");
            System.out.println("7: Array delete At beginning");
            System.out.println("8: Get Array index \n");
            System.out.println("9: contains Value in Array\n");
            System.out.println("10: search value in  Array");
            System.out.println("0.exit\n");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the data :");
                    val = scanner.nextInt();
                    list.add(val);

                    break;
                case 2:
                    list.display();

                    break;

                case 3:
                    System.out.println("Enter the position (start at 0) :");
                    pos = scanner.nextInt();
                    if (pos < 0) {
                        System.out.println("invalid position .position start with 0 ");
                        break;
                    }


                    System.out.println("Enter the data");
                    val = scanner.nextInt();
                    list.insertAtPos(pos, val);
                    break;
                case 4:
                    System.out.println("Enter the position (position start with 0)");
                    pos = scanner.nextInt();
                    if (pos < 0) {
                        System.out.println("Invalid position . Position start with 0");
                        break;
                    }
                    list.deleteAtPos(pos);

                    break;
                case 5:
                    int length = list.length();
                    System.out.println("Array of Length = " + length);
                    break;
                case 6:
                    list.deleteAtEnd();
                    System.out.println("Array delete at end position");
                    break;
                case 7:
                    list.deleteFromBeginning();
                    break;
                case 8:
                    System.out.println("Enter the index");
                    index = scanner.nextInt();
                    int data = list.get(index);
                    System.out.println("index of data " + data);
                    break;
                case 9:
                    System.out.println("Enter the search value in array ");
                    searchValue= scanner.nextInt();
                    System.out.println( "contains in array element "+list.contains(searchValue));
                    break;
                case 10:
                    System.out.println("enter the search value");
                    searchArray = scanner.nextInt();
                    System.out.println("search index in array  :"+ list.search( searchArray));
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice ");
            }
        }
    }
}
