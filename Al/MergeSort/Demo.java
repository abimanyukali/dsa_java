package Al.MergeSort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] inp = {9, 4, 7, 1, 6, 2, 8, 4};
        inp = sorting.mergeSort(inp);
        System.out.println(Arrays.toString(inp));


        System.out.println("_________________________");
        sorting.mergeSortinPlace(inp,0,inp.length);
        System.out.println(Arrays.toString(inp));
    }

}
