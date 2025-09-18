// bubble sort 
public class bubblesort {
    public static void  sort(int [] nums){
int n = nums.length;
for(int i = 0;i<n-1;i++){
for(int j = 0;j<n-1-i;j++){
if(nums[j]>nums[j+1]){
int temp = nums[j];

nums[j]=nums[j+1];
nums[j+1] = temp;

}

}

}
for (int index = 0; index < n; index++) {
    System.out.print(nums[index] + " ");
}

    }
    public static void main(String args[]){
int [] nums ={1,3,5,7,3,8,9,0};
sort(nums);

    }
}
