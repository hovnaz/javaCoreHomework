import homework.arrayUtil.ArrayUtil;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] array = {2,5,8,10,32,22,11,66,12,30};
        ArrayUtil list = new ArrayUtil(array);

        System.out.println("max "+list.max());
        System.out.println("min "+list.min());
        System.out.println("even "+Arrays.toString(list.even()));
        System.out.println("odd"+Arrays.toString(list.odd()));
        System.out.println("evenCount "+list.evenCount());
        System.out.println("oddCount "+ list.oddCount());
        list.print();
    }
}
