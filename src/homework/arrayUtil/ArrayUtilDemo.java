package homework.arrayUtil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {1,2,4,7,8,9,1,4,6,-7,8,1,2,4,8};
        ArrayUtil util = new ArrayUtil(array);
        System.out.println("max = " + util.min());
    }
}
