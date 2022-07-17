package homework.arrayUtil;

import java.util.Arrays;

/**
 * Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ. Եթե ունենք՝ false
 * Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;
 * Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և եթե մեր մասիվի մեջ ունենք այդ թվից, կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը
 * Գրել մեթոդ set անունով, որը կընդունի int index, int value և վալյուն կդնի տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).
 * Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը, իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի
 * Գրել մեթոդ delete(int index) որ տանք ինդեքսը, այդ ինդեքսի տակ գտնվող թիվը հեռացնի մասիվից. (նոր մասիվ պետք չէ սարքել)
 */
public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }
    public void add(int index, int value){
        if (array.length == size) {
            extend();
        }
        shiftRight(index);
        array[index] = value;
        size++;
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int getByIndex(int index){
        return isRange(index) ? array[index] : 0;
    }
    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
    public void set(int index, int value){
        if (!isRange(index)) {
            throw new ArrayIndexOutOfBoundsException("array size is " + size + " plase enter in rage size your entered index is: " + index);
        }
        array[index] = value;
    }
    public void delate(int index){
        if (!isRange(index)) {
            throw new ArrayIndexOutOfBoundsException("array size is " + size + " plase enter in rage size your entered index is: " + index);
        }
        array[index] = 0;
        shiftLeft(index);
    }
    private boolean isRange(int index){
        return index <= size || index >= 0;
    }
    private void shiftRight(int index){
        if (!isRange(index)) {
            throw new ArrayIndexOutOfBoundsException("array size is " + size + " plase enter in rage size your entered index is: " + index);
        }
        if (size - index >= 0) System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = 0;
    }
    private void shiftLeft(int index){
        if (!isRange(index)) {
            throw new ArrayIndexOutOfBoundsException("array size is " + size + " plase enter in rage size your entered index is: " + index);
        }
        if (size - index >= 0) System.arraycopy(array, index + 1, array, index, size - index);
    }
    public void print(){
        StringBuilder res = new StringBuilder();
        res.append("[ ");
        for (int i = 0; i < size; i++) {
            res.append(array[i]);
            res.append(", ");
        }
        res.append(" ]");
        System.out.println(res);
    }
}
