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
    //reverse recursively
    public static Node reverse(Node head){
if(head==null || head.next==null){
return head;
}
reverse(head.next);
head.next.next=head;
return head;

    }
    
//find and remove nth node from end
public static void findremove(int n, Node  head){
int count =0;
Node temp=head;

while(head!=null){
head=head.next;
count++;
}
for(int i =1;i<(count-n);i++){
temp=temp.next;
}

temp.next=temp.next.next;

}

//iterative search
public static void iterativesearch(Node head,int data){
boolean isfound =false;
while(head!=null){
    if (head.data==data) {
    isfound=true;
}
head=head.next;
 }

if (isfound) {
    System.out.println("element found ");
}else{
    System.out.println("element not found");
}
}
//recursive search
public static boolean recursivesearch(Node head,int data){

if(head==null){
    return false;
}
if(head.data==data){
return true;
}
return recursivesearch(head.next,data);

}

//add at last
public static void addatlast(Node head,int data){
Node newnode =new Node(data);

while(head.next!=null){
head=head.next;
}
head.next=newnode;

}
//delete atfirst
public static Node deletefirst(Node head){
head=head.next;
return head;
}
//delete atlast
public static void deletelast(Node head){
while(head.next!=null){
    head=head.next;
    head.next=null;
}
}
//add in the middle of linkelist
public static void addatmiddle(Node head,int data){
    Node newnode = new Node(data);
    Node temp =head;
int count =0;
while(temp!=null){
    temp=temp.next;
count++;
}
int mid=count/2;
for(int i=0;i<mid;i++){
head=head.next;

}
newnode.next=head.next;
head.next=newnode;

}

    public static void main(String args[]){
Node n1 = new Node(10);
Node n2 =new Node(12);
n1.next=n2;
Node head = n1;
head=addfirst(head, 34);




addatlast(head, 50);

head=deletefirst(head);

addatmiddle(head,16);
iterativesearch(head, 11);
System.out.println(recursivesearch(head, 16));
findremove(2, head);
while(head!=null){
    System.out.println(head.data);
head=head.next;

}

    }
    
    
}



