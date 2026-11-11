package homework;

public class BraceCheckerTest {

    public static void main(String[] args) {
        new BraceChecker ("Hello from [Java]" ).check();
        new BraceChecker ("{Hello (Java)}" ).check();
        new BraceChecker ("{[()]}" ).check();
        new BraceChecker ("Hello {from [Java (world)]}").check();
        new BraceChecker ("Hello {from [Java)").check();
        new BraceChecker ("{Hello() Java]").check();
        new BraceChecker ("Hello from Java]").check();
        new BraceChecker ("{Hello Java").check();

    }
}
