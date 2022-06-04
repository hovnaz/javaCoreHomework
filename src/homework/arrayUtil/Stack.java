package homework.arrayUtil;

public class Stack {
    private int tos = -1;
    private char[] data;

    public Stack(){
        data = new char[10];
    }
    public Stack(String str){
        data = str.toCharArray().clone();
        tos = data.length-1;
    }
    public Stack(int size){
        data = new char[size];
    }
    public void push(char value){
        if (data.length == tos) increaseArray();
        data[++tos] = value;
    }
    public int length(){
        return tos+1;
    }
    public char pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return '?';
        }
        return data[tos--];
    }
    private void increaseArray(){
        char[] result = new char[data.length + 10];
        System.arraycopy(data, 0, result, 0, data.length);
        data = result;
    }
    public boolean isEmpty(){
        return tos == -1;
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return '?';
        }
        return data[tos];
    }
}
