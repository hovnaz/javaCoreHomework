package homework.arrayUtil;

import java.util.Arrays;

public class ArraySort {
    static int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
    public static void main(String[] args) {

        numbers = bubbleSort();
        System.out.println("bubbleSort: " + Arrays.toString(numbers));
        revers(numbers);
        System.out.println("revers: " + Arrays.toString(numbers));
    }
    public static int[] bubbleSort() {
        int[] arr = numbers;
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
