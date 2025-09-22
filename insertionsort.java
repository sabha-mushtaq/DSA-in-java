import java.util.*;
public class insertionsort {
    public static void sort(int [] nums){
 int n = nums.length;       
for(int i =1;i<n;i++){
int j=i-1;
int key = nums[i];
while(j>=0 && key<nums[j]){
nums[j+1]=nums[j];
j--;

}
nums[j+1]=key;

}



    }
    public static void main(String args[]){
int [] nums ={ 6,5,4,7};
sort(nums);
for( int num:nums){

System.out.print(num + " ");

}

System.out.println();  
int [] arr1={4,8,6,1,3,2};
Arrays.sort(arr1,0,3);

System.out.println(Arrays.toString(arr1));
Integer [] arr2={4,8,6,1,3,2};
Arrays.sort(arr2,0,3,Collections.reverseOrder());
System.out.println(Arrays.toString(arr1));
    }
}
