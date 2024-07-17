package Al.sorting;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {10, 30, 2, 0, 88, 93,2,100, 75, 90};
        sort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));



        sort.selectionDescSort(arr);
        System.out.println(Arrays.toString(arr));

        sort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        sort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
