public class StairCasesearch {
    public static boolean Search(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1; // start at top-right corner

        while (col >= 0 && row < matrix.length) {
            if (key == matrix[row][col]) {
                System.out.println("Key is found at (" + row + "," + col + ")");
                return true;
            }

            if (key < matrix[row][col]) {
                col--;  // move left
            } else {
                row++;  // move down
            }
        }

        return false; // not found
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 29;
        if (!Search(matrix, key)) {
            System.out.println("Key not found!");
        }
    }
}

