import java.util.*;

public class Tut27_reverse_stack_re {

    static void reverseStack(Stack<Integer> stack) {

        // Base case
        if (stack.isEmpty()) {
            return;
        }

        // Top element remove
        int top = stack.pop();

        // Reverse remaining stack
        reverseStack(stack);

        // Put removed element at bottom
        insertAtBottom(stack, top);
    }

    static void insertAtBottom(Stack<Integer> stack, int value) {

        // Agar stack empty hai
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        // Top remove
        int top = stack.pop();

        // Insert value at bottom
        insertAtBottom(stack, value);

        // Wapas top element daal do
        stack.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(0);
        s.push(1);
        s.push(554);
        s.push(55);
        s.push(5);
        s.push(4);
        
        reverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}