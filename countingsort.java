public class countingsort {
public static  void Sort(int arr[]){
// finding the largest
int largest = Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){

largest=Math.max(largest, arr[i]);
}
// creation of count array
int [] count = new int[largest+1];

for(int i =0;i<arr.length;i++){
count[arr[i]]++;
}
int j = 0;
// sorting of array
for(int i = 0;i<count.length;i++){
while(count[i]>0){
arr[j]=i;
j++;
count[i]--;
}
}

}




    public static void main(String args[]){
int [] arr ={3,2,5,6,7,9,8,1,3};
Sort(arr);
for(int num:arr){
System.out.print(num + " ");
}

    }
}
