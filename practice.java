public class practice {
    static class Node{

int data;
Node next;

Node(int data){
this.data=data;
this.next=null;
}
    }

    //add at first
    public static Node addfirst(Node head,int data){
Node newnode =new Node(data);
newnode.next=head;
head=newnode;
return newnode;




    }
//add at last
public static void addatlast(Node head,int data){
Node newnode =new Node(data);
while(head.next!=null){
head=head.next;
}
head.next=newnode;

}

    public static void main(String args[]){
Node n1 = new Node(10);
Node n2 =new Node(12);
n1.next=n2;
Node head = n1;
head=addfirst(head, 34);




addatlast(head, 50);
while(head!=null){
    System.out.println(head.data);
head=head.next;

}
    }
    
}



