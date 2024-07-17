package Al.sorting;

public class sort {
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {//fix the position
            int min = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }

            }
            //swap -i minIndex;
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
    }

    public static void selectionDescSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex])
                    maxIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
            if (!swapped)
                break;
        }
    }
    public static void insertionSort(int[] arr){
        for(int i =1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1]  =temp;
                }
                else break;
            }
        }
    }





}
