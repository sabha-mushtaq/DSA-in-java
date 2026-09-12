//add at bottom of stack using  recursion

import java.util.Stack;

public class stack4 {
    static Stack <Integer> stack = new Stack<>();
    public static void addatbottom(int x){
if(stack.isEmpty()){
stack.push(x);
return;
}
int value = stack.pop();
addatbottom(x);
stack.push(value);

    }
    public static void main(String args[]){

        stack.push(1);
        stack.push(2);
        stack.push(3);

        addatbottom(0);

        System.out.println(stack);
    }
}
