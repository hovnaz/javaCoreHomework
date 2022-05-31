package homework.arrayUtil;

import java.util.Arrays;

public class ArrayUtil {
    int[] array;

    public ArrayUtil(int[] array){
        this.array = array;
    }
    public void print(){
        if (array.length == 0) System.out.print("[]");
        System.out.print("[ ");
        for (int j : array) {
            System.out.print(j + ", ");
        }
        System.out.print("]");

    }
    public long sum(){
       long res = 0;
        for (int j : array) {
            res += j;
        }
        return res;
    }
    public int avg(){
        return (int) (sum() / array.length);
    }
    public int max(){
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            if (res < array[i]) res = array[i];
        }
        return res;
    }
    public int min(){
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            if (res > array[i]) res = array[i];
        }
        return res;
    }
    public int[] even(){
        int[] arr = new int[array.length];
        int size = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                arr[size++] = j;
            }
        }
        return Arrays.copyOfRange(arr, 0, size);
    }
    public int[] odd(){
        int[] arr = new int[array.length];
        int size = 0;
        for (int j : array) {
            if (j % 2 == 1) {
                arr[size++] = j;
            }
        }
        return Arrays.copyOfRange(arr, 0, size);
    }
    public int evenCount(){
        return even().length;
    }
    public int oddCount(){
        return odd().length;
    }
}
