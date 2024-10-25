package org.example;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackTest {

    /**
     * Here we use stacks to keep track of opening and closing matches
     * We traverse each character putting the opening characters into the stack then removing the matching closing one
     * @param s String object that contains a sequence of characters as such: "([][])"
     * @return if stack is empty it means every character matched and we return true else we return false
     */
    public static boolean isBalanced(String s) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (char ch : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                // Check if stack is empty or the top of stack doesn't match
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // If the stack is empty, all brackets were balanced; otherwise, they were not
        return stack.isEmpty();
    }

    @Test
    public void testStack() {
        String input1 = "([][])";
        String input2 = "([](){([])})";
        String input3 = "{{[()]]";

        assertTrue(isBalanced(input1));
        assertTrue(isBalanced(input2));
        assertFalse(isBalanced(input3));
    }
}
