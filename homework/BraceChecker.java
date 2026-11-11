package homework;

import java.util.Stack;

public class BraceChecker {
    String text;


    public BraceChecker(String text) {
        this.text = text;
    }

    void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Error in text" + " " + text);
                } else {
                    char last = (char) stack.pop();
                    if ((ch == '}' && last != '{' || ch == ']' && last != '[' || ch == ')' && last != '(')) {
                        System.out.println("Error in text" + " " + text);
                    }
                }
            }
        }
            if (!stack.isEmpty()) {
                System.out.println("Error in text" + " " + text);
            }
        }
    }


