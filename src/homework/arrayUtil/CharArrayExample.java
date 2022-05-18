package homework.arrayUtil;

import java.util.Arrays;

public class CharArrayExample {
    static char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
    public static void main(String[] args) {
        chars = new char[]{'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println("countOf "+countOf('o'));
        chars = new char[]{'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println("middle "+ Arrays.toString(middle()));
        chars = new char[]{'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        System.out.println("endsWith "+endsWith("ly"));
        chars = new char[]{'b','a','b','o','b','a'};
        System.out.println("startWith "+startWith());
        chars = new char[]{' ',' ','b','a','r','e','v',' ',' '};
        System.out.print("countOf ");
        trim();
    }
    public static int countOf(char value){
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (value == chars[i]) count++;
        }
        return count;
    }
    public static char[] middle(){
        char[] res = new char[2];
        if(chars.length>1) {
            res[1]=chars[chars.length/2];
            res[0]=chars[chars.length/2-1];
            return res;
        } else {
            res[1]=chars[((chars.length+1)/2) -1];
        }
        return res;
    }
    public static boolean endsWith(String value){
        char[] valueCharArr = value.toCharArray();
        int index = valueCharArr.length;
        for (int i = chars.length-1; i > 0 & 0 < index--; i--) {
            if (chars[i] != valueCharArr[index]) return false;
        }
        return true;
    }
    public static boolean startWith(){
        for (int i = 0; i < chars.length; i++) {
            if (chars.length > i+2 && chars[i] == 'b' && chars[i + 2] == 'b') return true;
        }
        return false;
    }
    public static void trim(){
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') System.out.print(chars[i]);
        }
    }

}
