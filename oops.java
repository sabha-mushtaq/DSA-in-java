public class oops {
    public static void main(String args[]){
pen p1 = new pen();
p1.setcolor("blue");
System.out.println(p1.color);
BankAccount b1 = new BankAccount();
b1.username = "sabha mushtaq";
System.out.println(b1.username);
b1.setpassword("tree");
System.out.println(b1.userpassword);
    }


 static class pen {
String color;
int tip;
void setcolor(String newColor){
    color = newColor;
}
void settip(int x){
tip= x;

}

   }
}
class BankAccount{
 String username;
 String userpassword;
 void setpassword(String pwd){

    userpassword =pwd;
 }

}