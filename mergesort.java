public class mergesort {
    // function to divide array
//     public static void divide(int arr[],int s,int e){
// int mid = s+(e-s)/2;
// if(s>=e){
//     return;
// }
// //divide left array
// divide(arr, s, mid);
// //divide right array
// divide(arr,mid+1,e);
// merge(arr, s, e);
//     }
//     //function to conquer array that is merge

//   public static void merge(int [] arr,int s,int e){
// int arrtemp[]= new int[arr.length];
// int mid = s+(e-s)/2;
// int x=0;
// int idx1=s;
// int idx2=mid+1;
// while(idx1<=mid && idx2<=e ){
// if(arr[idx1]<=arr[idx2]){
//     arrtemp[x++]=arr[idx1++];
// }else{
//     arrtemp[x++]=arr[idx2++];
// }
// }
// while (idx1<=mid) {
//     arrtemp[x++]=arr[idx1++]; 
// }
// while (idx2<=e) {
//         arrtemp[x++]=arr[idx2++];
// }
// for(int i=0;i<=arrtemp.length;i++){
// arr[s+i] =arrtemp[i];
// }
//   }  


//    public static void mergeSort(int arr[],int s,int e){
// divide(int arr[],int s,int e)
// merge(int arr,int s,int e)
//    } 
   public static int partition(int arr[],int low,int high){
    //choosing last elemnt as pivot
int pivot=arr[high];
int i=low-1;
for(int j=low;j<high;j++){
if(arr[j]<pivot){
i++;
int temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
int temp = arr[i+1];
arr[i+1]=arr[high];
arr[high]=temp;
return i+1;

   }

   //quicksort
   public static void quicksort(int arr[],int low ,int high){
  
    if(low<high){
          int piindex=partition(arr,low,high);
    quicksort(arr, low, piindex-1);
    quicksort(arr, piindex+1, high);}

   }
  public static void main(String args[]){
int arr[] = {3, 6, 2, 5};
   quicksort(arr,0,3);

for(int num : arr){
System.out.println(num);
}
}
}
