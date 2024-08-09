import java.util.Stack;

public class ValidParenthesis {
    public boolean isValidParenthesis(String s) {
        int length = s.length();
        
        if (s.trim().equals("")) {
            return false;
        }       
        
        Stack<Character> parenthesis = new Stack<>();
        int i = 0;
        for(i = 0; i < length; i++) {
            if (s.charAt(i) == '(') {
                parenthesis.push(')');
            } else if (s.charAt(i) == '[') {
                parenthesis.push(']');
            } else if (s.charAt(i) == '{') {
                parenthesis.push('}');
            } else if ((parenthesis.isEmpty()) || (parenthesis.pop() != s.charAt(i))) {
                return false;
            }
        }
        
        return parenthesis.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println(validParenthesis.isValidParenthesis("([)]"));
    }
}
