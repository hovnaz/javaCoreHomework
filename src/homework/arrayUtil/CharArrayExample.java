package homework.arrayUtil;

public class CharArrayExample {
    char[] array;
    CharArrayExample(char[] array){
        this.array = array;
    }
    public int countOf(char value){
        int count = 0;

        for (char c : array) {
            if (value == c) count++;
        }
        return count;
    }
    public char[] middle(){
        char[] res = new char[2];
        if(array.length>1) {
            res[1]=array[array.length/2];
            res[0]=array[array.length/2-1];
            return res;
        } else {
            res[1]=array[((array.length+1)/2) -1];
        }
        return res;
    }
    public boolean endsWith(String value){
        char[] valueCharArr = value.toCharArray();
        int index = valueCharArr.length;
        for (int i = array.length-1; i > 0 & 0 < index--; i--) {
            if (array[i] != valueCharArr[index]) return false;
        }
        return true;
    }
    public boolean startWith(){
        for (int i = 0; i < array.length; i++) {
            if (array.length > i+2 && array[i] == 'b' && array[i + 2] == 'b') return true;
        }
        return false;
    }
    public void trim(){
        for (char aChar : array) {
            if (aChar != ' ') System.out.print(aChar);
        }
    }

}
