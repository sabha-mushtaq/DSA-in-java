// 4. Write a Java program to read two one-dimensional arrays
// and merge them into a single array, then display the merged
// array in sorted order.
public class assignment7 {
    public static void quicksort(int arr[]){

    }
    public static void merge(int arr1[], int arr2[]) {
        
        int newarr[] = new int[arr1.length + arr2.length];

        // Copy arr1
        for (int i = 0; i < arr1.length; i++) {
            newarr[i] = arr1[i];
        }

        // Copy arr2
        for (int i = 0; i < arr2.length; i++) {
            newarr[arr1.length + i] = arr2[i];
        }

        // Print merged array
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,6,7,8};
        merge(arr1, arr2);
    }
}