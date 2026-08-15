import java.util.*;
public class linkedlist1 {
//creating linkedlist using collection framework
 static LinkedList<String> list = new LinkedList<String>();
static int i=0;

// building linkedlist from scratch
   static  class Node{
String data;
Node next;
Node(String data){
    this.data=data;
    this.next=null;

}
    }
  static void print(Node head){
    int size=0;
while(head!=null){

System.out.print(head.data + "->");
   head=head.next;
   size++;
}
System.out.println();
System.out.println("size of linkedlist :" + size);

    }
    static Node addfirst(Node head ,String data){
Node n = new Node(data);
        Node n1= head;
       
        n.next=n1;
return n;
        

    }
    static void lastelement(Node head,String data){
        Node n1 = new Node(data);
        while(head.next!=null){
head=head.next;
        }
        head.next=n1;


    }
    static Node deletefirst(Node head){

        head=head.next;
        return head;

    }
    static void deletelast(Node head){
while(head.next.next!=null){
   head=head.next;
}
head.next=null;
    }
    //reverse a linkedlist iterative approach
    static Node reverse(Node head){
Node prev=head;
Node curr=head.next;

while(curr!=null){
  Node nextnode=curr.next;
curr.next=prev;
prev=curr;
curr=nextnode;



}
head.next=null;
head=prev;
return head;
    }
    //reverse linkedlist recuresive approach
    
    public static void main(String args[]){
Node n1 = new Node("sabha");
Node n2 = new Node("Mushtaq");
Node n3 = new Node("bhat");

n1.next=n2;
n2.next=n3;
print(n1);
n1=addfirst(n1, "student");
print(n1);
lastelement(n1, "last");
print(n1);
n1=deletefirst(n1);
print(n1);
deletelast(n1);
print(n1);
System.out.println("reversed likedlist :");
 Node n4=reverse(n1);
print(n4);
list.addFirst("apple");
list.add("ball");
list.add("cat");
list.add("dog");
list.removeLast();
list.addLast("EUROPE");
list.add(3,"sucess");
while (i<list.size()) {
    System.out.println(list.get(i));
    i++;
}
System.out.println(list.size());

    }

}
