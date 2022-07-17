package homework.arrayUtil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(1);
        array.add(2);
        array.add(5);
        array.add(7);
        array.print();
        array.delate(2);
        array.print();
    }
}
