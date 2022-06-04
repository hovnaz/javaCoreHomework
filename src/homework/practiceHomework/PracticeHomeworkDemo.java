package homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,6,7,8,8,7,4,4,1};

        PracticeHomework prac = new PracticeHomework();

        System.out.println(prac.calcAge(2000)+": calcAge");
        System.out.println(prac.convert(5)+": convert");
        System.out.println(prac.isSameNum(2002,2002)+": isSameNum");
        System.out.println(prac.maxLength(array1,array2)+": maxLength");
        System.out.println(prac.lessThanOrEqualToZero(2002)+": lessThanOrEqualToZero");
        System.out.println(prac.reverseBool(true)+": reverseBool");
        System.out.println(prac.nextNumber(5)+": nextNumber");

    }
}
