public class selectionsort {
    public static void sort(int nums[]) {
        int n = nums.length;       

        // outer loop for turns
        for (int turn = 0; turn < n - 1; turn++) {
            int minindex = turn;

            // inner loop for finding minimum index 
            for (int i = turn + 1; i < n; i++) {
                if (nums[i] < nums[minindex]) {
                    minindex = i;
                }
            }

            // swap
            int temp = nums[turn];
            nums[turn] = nums[minindex];
            nums[minindex] = temp;
        }
    }

    public static void main(String args[]) {
        int [] nums = {6, 3, 8, 9, 7};
        sort(nums);

        // print sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


