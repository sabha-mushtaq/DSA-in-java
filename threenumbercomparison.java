import java.util.*;
public class threenumbercomparison {
  public static void main(String args[])  {
    Scanner numb = new Scanner(System.in);
System.out.println("enter a");
int a = numb.nextInt();
System.out.println("ente b");
int b = numb.nextInt();
System.out.println("ente c");
int c = numb.nextInt();
if ((a>b)&& (a>c)) {
    
    System.out.println("a is graeatest");
}else if(b >c)
{
    System.out.println("b is graeatest");}
else{

    System.out.println("c is graeatest");
}
  }

}
