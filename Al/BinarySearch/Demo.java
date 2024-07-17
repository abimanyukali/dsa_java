package Al.BinarySearch;

public class Demo {
    /*
    order agnostic search
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 9, 12, 15, 18, 20, 23, 27, 29, 30, 35, 38, 39, 40};
        System.out.println(BinarySearch.search(arr, 15));

        int[] arr2={99,98,88,87,76,65,43,33,32,28,27,23,21,10,8,3,1,0};
        System.out.println(BinarySearch.search(arr2,100));
    }
}
