public class palindrome {
static void ifpalindrome(int n){
int originalNumber = n;
int reversedn=0;
while(n >0){
int np = n%10;
n = n/10;
reversedn = reversedn * 10 + np;


}
if (originalNumber == reversedn) {
    System.out.println("number is a palindrone");
}else{
System.out.println("number is not a palindrone");}
}
    public  static void main(String args[]){


ifpalindrome(122);



    }
}
