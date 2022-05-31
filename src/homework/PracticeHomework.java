package homework;

public class PracticeHomework {
    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    long convert(int minutes) {
        return minutes * 60L;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը։
    int calcAge(int years) {
        return isCalcAge(years) ? 366 : 365;
    }

    boolean isCalcAge(int years) {
        return ((years % 4 == 0) && (years % 100 != 0)) || (years % 400 == 0);
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        return ++number;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
        return a == b;
    }

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
    //մնացած դեպքերում վերադարձնել false
    boolean lessThanOrEqualToZero(int number) {
        return number <= 0;
    }

    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
    boolean reverseBool(boolean value) {
        return !value;
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[] array1, int[] array2) {
        return array1.length >= array2.length ? array1.length : array2.length;
    }

}
