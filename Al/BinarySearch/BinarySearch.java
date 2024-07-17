package Al.BinarySearch;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean asc = false;
        if (arr[start] < arr[end])
            asc = true;


        while (start <= end) {
            int mid = (start + end) / 2;
            if(asc) {


                if (target > arr[mid]) //focus on the side
                    start = mid + 1;
                else if (target < arr[mid]) //focus on the left side

                    end = mid - 1;
                else
                    return mid;
            }
            else{
                 if(target>arr[mid]) //focus on left side
                     end = end-1;
                 else if(target <arr[mid]) //focus on right side;
                     start = start+1;
                 else
                     return mid;
            }
        }
        return -1;
    }

}
