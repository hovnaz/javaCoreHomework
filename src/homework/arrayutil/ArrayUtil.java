package homework.arrayutil;

import java.util.Arrays;

public class ArrayUtil {
    int[] data;

    public static void main(String[] args) {
        int[] array = {2,5,8,10,32,22,11,66,12,30};
        ArrayUtil list = new ArrayUtil(array);
        System.out.println("max "+list.max());
        System.out.println("min "+list.min());
        System.out.println("even "+Arrays.toString(list.even()));
        System.out.println("odd"+Arrays.toString(list.odd()));
        System.out.println("evenCount "+list.evenCount());
        System.out.println("oddCount "+ list.oddCount());
        System.out.println(list.sum());
        System.out.println(list.arithmeticMean());
        list.print();
    }

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
    public long sum(){
       long res = 0;
        for (int i = 0; i < data.length; i++) {
            res+=data[i];
        }
        return res;
    }
    public int arithmeticMean(){
        return (int)(sum() / data.length);
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
