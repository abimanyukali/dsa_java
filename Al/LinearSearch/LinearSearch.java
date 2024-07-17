package Al.LinearSearch;

public class LinearSearch {
    public static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target)
                return i;
        return -1;
    }

    public static boolean contains(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target)
                return true;
        return false;
//
//        for (int j : arr)
//            if (j == target)
//                return true;
//        return false;
    }

    public static int find(String str, char target) {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == target)
                return i;
        return -1;
    }

    public static boolean contains(String str, char target) {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == target)
                return true;
        return false;
    }

    public static int[] find(int [][] arr,int target){
        for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target)
                    return  new int[] {row,col};
            }
        }
        return new int[] {-1,-1};
    }
}


/*
find max element
find min element
count a character in string = count(str,"r")
count the 4 digit element in an array ={123,8898,234,009}
 */