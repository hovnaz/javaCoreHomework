package homework.arrayUtil;

import java.util.Arrays;

public class ArraySpaceExample {

    static char[] spaceArray = {' ',' ','c', 'a', 't', ' ', 'b', 'i',' '};

    public static void main(String[] args) {
        System.out.println("trim: " + Arrays.toString(trim()));
    }

    public static char[] trim() {

        int startIndex = -1;
        int endIndex = spaceArray.length - 1;

        for (int i = 0; i < spaceArray.length; i++) { // start index
            startIndex++;
            if (spaceArray[i] != ' ') break;
        }

        for (int i = spaceArray.length-1; i > 0; i--, endIndex--) { // end index
            if (spaceArray[i] != ' ') break;
        }
        char[] res = new char[endIndex-startIndex];
        int size = 0;
        for (int i = startIndex; i < endIndex; i++,size++) {
            res[size] = spaceArray[i];
        }
        return res;
    }
}
