import java.util.*;
public class evenodd {
    public  static void main (String args[]){

System.out.println("enter the number :");
Scanner numb = new Scanner(System.in);
int a = numb.nextInt();
if (a%2 == 0) {
    System.out.println("number is even ");
}
else{

   System.out.println("number is odd") ;
}
    }
}
