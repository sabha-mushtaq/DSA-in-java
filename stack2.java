//implementing stack using arraylist
import java.util.ArrayList;

public class Stack2 {

    ArrayList<Integer> list = new ArrayList<>();
    int length = -1;

    public void push(int data) {
        list.add(data);
        length++;
    }

    public int pop() {
        int value = list.get(length);
        list.remove(length);
        length--;
        return value;
    }

    public boolean isEmpty() {
        return length == -1;
    }

    public static void main(String[] args) {

        Stack2 stack = new Stack2();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
    }
}