import java.util.Stack;

public class stack {
 static class Node{
int data;
Node next;
Node(int data){
    this.data=data;
    this.next=null;
}

}
static class  stacks{
    Node top ;
    stacks(){
top=null;
    }
    void push(int data){
Node newnode = new Node(data);
newnode.next=top;
top=newnode;


    }

int pop(){
int value =top.data;
top=top.next;
return value;

}
int peek(){
return top.data;
}
boolean isempty(){
    return top==null;
}
}

    public static void main(String args[]){
stacks s1 = new stacks();
s1.push(33);
s1.push(32);
s1.push(31);
s1.push(30);
System.out.println(s1.pop());
System.out.println(s1.peek());
// while(!s1.isempty()){
// System.out.println(s1.pop());
// }

    }

}
