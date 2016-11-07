package src;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParanthesis {

    
    private BalancedParanthesis() {};

    /**
     * Returns true is parenthesis match open and close.
     * Understands [], {}, () as the brackets
     * It is clients responsibility to include only valid paranthesis as input.
     * A false could indicate that either parenthesis did not match or input including chars other than valid paranthesis
     * 
     * @param str   the input brackets
     * @return      true if paranthesis match.
     */
    public static boolean isBalanced(String str) {
    	
    	int len = str.length();
    	
    	if (len == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        
        if ((len % 2) != 0) {
            return false;
        }
        
    	Map<Character, Character> brackets = new HashMap<Character, Character>();
    	Stack<Character> stack = new Stack<Character>();
    	
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');
 
        for (int i = 0; i < len; i++) {
            if (brackets.containsKey(str.charAt(i))) {
                stack.push(str.charAt(i));
            } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
                return false;
            } 
        }
        return true;
    } 

    public static void main(String[] args) {
    	
    	System.out.println(isBalanced("{}([])"));
        System.out.println(isBalanced("([}])"));
        System.out.println(isBalanced("([])"));
        System.out.println(isBalanced("()[]{}[][]"));
        
    }
}