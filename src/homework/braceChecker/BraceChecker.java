package homework.braceChecker;

import homework.arrayUtil.Stack;



public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
        replaceAll();
    }

    public boolean check() {
        Stack s = new Stack();
        for (char c : text.toCharArray())
        if (s.length() > 0 && isClosing(s.peek(), c)) s.pop();
            else s.push(c);
        return s.length() == 0;
    }
    private void replaceAll(){
        String res = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c){
                case '{':
                case '}':
                case '[':
                case ']':
                case '(':
                case ')':
                    res += c;
                    break;
            }
        }
        text = res;
    }
    public boolean isClosing(char x, char c) {
        return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
    }
}
