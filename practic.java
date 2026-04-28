import java.util.Scanner;

public class practic {
public static void pair(int[] nums){
  // first element  
  int count = 0;
for(int i=0;i<nums.length;i++){
// second element
for(int j=i+1;j<nums.length;j++){
System.out.println("(" + nums[i] + "," + nums[j] + ")");
count++;
}
}
System.out.println("total pairs are :" + count);
}

public static void subarray(int[] nums){
int count = 0;
// start
for(int i =0;i<nums.length;i++){
//end
for(int j=i;j<nums.length;j++){
    System.out.print("(");
    //print subarray
    for(int k = i;k<=j;k++){

System.out.print(  nums[k] );
if(k<j){
System.out.print(",");
}

    }
 
    System.out.print(")");
    count++;
       System.out.println();

}

}


System.out.println("total subarrays :" + count);
}

// problems on recursion
public static void  printuptoone(int n){
if(n<1){
return ;
}
System.out.println(n);
printuptoone(n-1);


}
//factorial
public static int factoral(int n){
    if(n==1){
return 1;
    }
    n = n * factoral(n-1);
    return n;
}
// fibonacci
public static int fibonnaci(int n){

if(n==2 || n==1){
    return 1;
}
return fibonnaci(n-1)+fibonnaci(n-2);


}
// check if a array is sorted usig recursion
public static boolean isarrsorted(int[]arr,int index){
if(index == arr.length-1){
return true;
}
if(arr[index]>arr[index+1]){
    return false;
}
return isarrsorted(arr, index+1);
}

    public static void main(String[] args){
     int[]  nums= {1,2,3,7,5,6} ;
   subarray(nums);
   printuptoone(3);
   System.out.print(factoral(4));
   System.out.println(fibonnaci(3)); 
   System.out.println(isarrsorted(nums, 0));
    }
}

