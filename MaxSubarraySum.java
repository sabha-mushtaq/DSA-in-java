// brute force apprach
public class MaxSubarraySum {
    public static void printMaxSum(int numb[]) {
        int max_value = Integer.MIN_VALUE;

        for (int i = 0; i < numb.length; i++) {
            for (int j = i; j < numb.length; j++) {
                int currsum = 0;

                for (int k = i; k <= j; k++) {
                    currsum += numb[k];
                }

                System.out.println("Subarray (" + i + " to " + j + ") sum = " + currsum);

                if (currsum > max_value) {
                    max_value = currsum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + max_value);
    }

    public static void main(String args[]) {
        int numb[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printMaxSum(numb);
    }
}
