// Assignment 4:
// Write a Java program to check whether a two-digit number is special.
// A number is special if:
// Sum of digits + Product of digits = original number
// Example:
// 59 → 5+9 + 5×9 = 14 + 45 = 59
import java.util.*;

public class Assignment4 {
    public static void  check(int numb){
        int number =numb;
int sum =0;
int product =1;
while(numb>0){
    int r=numb%10;
    numb=numb/10;
    sum+=r;
    product*=r;

}
if ((sum+product)==number) {
    System.out.println("number is special ");
}else{
        System.out.println("number is not special ");
}
    }
    public static void main(String args[]){
check(519);
    }
}
