package Al.QuickStart;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args){
        int[] inp ={5,8,4,3,7,6,2,9,5};
        Sorting.quickSort(inp,0,inp.length-1);
        System.out.println("hello"+Arrays.toString(inp));
    }
}
