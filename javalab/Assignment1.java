// Assignment 1: Write a Java program that accepts a 5-digit number and prints:
//  Sum of digits at even positions
//  Sum of digits at odd positions
//  Difference between the two
// Example:
// Input: 54321
// Odd position sum = 5+3+1
// Even position sum = 4+2

import java.util.*;


public class Assignment1 {
  //function
  public static int returnSumeven(int num){
int count =0;
int sum=0;

while(num>0){
int r =num%10;
num=num/10;
count++;
if(count%2==0){
    sum+=r;
}

}
return sum;
  }  
  public static int returnSumodd(int num){
int count =0;
int sum=0;

while(num>0){
int r =num%10;
num=num/10;
count++;
if(count%2!=0){
    sum+=r;
}

}
return sum;
  } 
public static int differencesum(int numb){
returnSumeven(numb);
returnSumodd(numb);
int difference =(returnSumeven(numb)-returnSumodd(numb));
return difference;
}
public static void main(String args[]){
System.out.println(returnSumeven(54321));
System.out.println(returnSumodd(54321));
System.out.println(differencesum(54321));
}



}
