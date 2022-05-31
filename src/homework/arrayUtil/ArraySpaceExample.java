package homework.arrayUtil;

import java.util.Arrays;

public class ArraySpaceExample {

    public static char[] trim(char[] array) {

        int startIndex = -1;
        int endIndex = array.length - 1;

        for (char c : array) { // start index
            startIndex++;
            if (c != ' ') break;
        }

        for (int i = array.length-1; i > 0; i--, endIndex--) { // end index
            if (array[i] != ' ') break;
        }
        char[] res = new char[endIndex-startIndex];
        int size = 0;
        for (int i = startIndex; i < endIndex; i++,size++) {
            res[size] = array[i];
        }
        return res;
    }
}
