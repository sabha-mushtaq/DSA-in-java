// 3. Write a Java program to search for a given element in a one-
// dimensional array and display its position(s) if found.

public class assignment6 {
    public static int binarysearch(int arr[], int f){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(f == arr[mid]){
                return mid;
            }
            else if(f < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int arr[] = {2,3,5,7,8};

        int result = binarysearch(arr, 8);

        if(result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position " + result);
        }
    }
}
