public class leetcode1 {
    public static void majority(int arr []){
for (int i = 0; i < arr.length; i++) {
    int count =0;
    for (int j = i; j < arr.length; j++) {
        if (arr[i]==arr[j]) {
            count++;
        }
    }
    if (count>arr.length/2) {
        System.out.println("majority element is :" + arr[i]);
    }
}


    }
    public static void main(String args[]){
int nums[] ={2,2,1,1,1,};
majority(nums);

    }
}
