package homework.braceChecker;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text = "([{{{hgfh}}}]){}";
        BraceChecker bc = new BraceChecker(text);
        System.out.println(bc.check());
    }
}
