
// push element at bottom of stack using an extra array,it increases space complexity to O(n)

import java.util.Stack;

public class stack3 {

    static Stack<Integer> stack = new Stack<>();

    public static void addatbottom(int x) {

        Stack<Integer> temp = new Stack<>();

        // Move all elements from stack to temp
        while (!stack.isEmpty()) {
            int value = stack.pop();
            temp.push(value);
        }

        // Push x into the empty stack
        stack.push(x);

        // Move elements back
        while (!temp.isEmpty()) {
            int value = temp.pop();
            stack.push(value);
        }
    }

    public static void main(String args[]) {

        stack.push(1);
        stack.push(2);
        stack.push(3);

        addatbottom(0);

        System.out.println(stack);
    }
}

