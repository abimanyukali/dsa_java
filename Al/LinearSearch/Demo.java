package Al.LinearSearch;


import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(LinearSearch.find(arr, 7));
        System.out.println(LinearSearch.contains(arr, 8));

        String name ="ABIMANYU";
        System.out.println(LinearSearch.find (name, 's'));
        System.out.println(LinearSearch.contains(name,'U'));


        int[][] twoDArr=new int[][]{
                {2,5,8,9,10},
                {5,9,88,1000,0},
                {8,1,}
        };
        int[] result =LinearSearch.find(twoDArr,99);
        System.out.println(Arrays.toString(result));

    }


}
