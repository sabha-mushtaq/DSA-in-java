package stacks;
// implementing stack using linkedlist

public class stacks1 {
    
    //create a linkedlist
  static class Node{
        int data;
        Node next;
        public Node(int data) 
    {
this.data=data;
next=null;
    } 
    }
//create checkempty linkelist
    static class boolean isempty(Node list){
if(list.head==null){
return;
}
    }
    static class void push(Node list,int data){
if(isempty(list)){
list.data=data;

}
    }
    public static void main(String args[]){

    }
}
