package homework.arrayutil;

import java.util.Arrays;

public class ArrayUtil {
    int[] data;
    public ArrayUtil(int[] arr){
        data = arr;
    }
    public void print(){
        if (data == null) System.out.print("[]");
        System.out.print("[ ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+", ");
        }
        System.out.print("]");

    }
    public int max(){
        int res = data[0];
        for (int i = 0; i < data.length; i++) {
            if (res > data[i]) res = data[i];
        }
        return res;
    }
    public int min(){
        int res = data[0];
        for (int i = 0; i < data.length; i++) {
            if (res < data[i]) res = data[i];
        }
        return res;
    }
    public int[] even(){
        int[] arr = new int[data.length];
        int size = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0){
                arr[size++] = data[i];
            }
        }
        return Arrays.copyOfRange(arr, 0, size);
    }
    public int[] odd(){
        int[] arr = new int[data.length];
        int size = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 1){
                arr[size++] = data[i];
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
