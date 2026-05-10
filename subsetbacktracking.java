
public class subsetbacktracking {

    public static void subset(int arr[], int idx, int temp[], int tempintsize) {
        // Base case
        if (idx == arr.length) {
            // print current subset
            for (int i = 0; i < tempintsize; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();
            return;
        }

        // Include element
        temp[tempintsize] = arr[idx];
        subset(arr, idx + 1, temp, tempintsize + 1);

        // Exclude element (no need to remove, just don't use it)
        subset(arr, idx + 1, temp, tempintsize);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3};
        int temp[] = new int[arr.length]; // max size possible
        subset(arr, 0, temp, 0);
    }
}