package homework.arrayUtil;

public class ArraySort {

    public  int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                int next = arr[j+1];
                if (next < arr[j]){
                    int tmp = arr[j];
                    arr[j] = next;
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void revers(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tmp;
        }
    }
}
