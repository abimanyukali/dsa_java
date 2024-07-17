package Ds.Array;

import java.util.Arrays;

public class TestDynamicArray {

    int initialCapacity = 6;
    int arr[];
    int size;
    int capacity;
    int data;


    TestDynamicArray() {
        size = 0;
        arr = new int[initialCapacity];
        capacity = initialCapacity;

    }

    public void add(int val) {
        if (size == capacity)
            expandArray();
        arr[size++] = val;
    }

    private void expandArray() {
        capacity *= 2;
        arr = Arrays.copyOf(arr, capacity);
    }

    public void display() {
        System.out.println("Element in the Array");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public void insertAtPos(int pos, int val) {
        if (size == capacity)
            expandArray();
        for (int i = size - 1; i >= pos; i--)
            arr[i + 1] = arr[i];
        arr[pos] = val;
        size++;
    }

    public void deleteAtPos(int pos) {
        for (int i = pos + 1; i < size; i++) {
            arr[i - 1] = arr[i];
            System.out.println(size + "" + i);
        }

        System.out.println(arr[size]);
        size--;
    }

    public int length() {
        return size;
    }

    public void deleteAtEnd() {
        size--;
    }

    public void deleteFromBeginning() {
        for (int i = 1; i < size; i++)
            arr[i - 1] = arr[i];
        size--;
    }

    public int get(int index) {
        if (index <= size && index >= 0)
            data = arr[index];
        else {
            System.out.println("enter wrong index ");

        }
        return data;


    }

    public boolean contains(int searchValue) {
        boolean bool = false;
        for (int i = 0; i < size; i++) {
            System.out.println(i);
            if (searchValue == arr[i]) {
                bool = true;
                return bool;
            }
        }
        return bool;

    }

    public int search(int searchArray) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchArray)
                return i;
        }
        System.out.println("your enter not exist");
        return 0;
    }

}
