public class diagonalsum {
    public static void sum(int matrix[][]) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal (avoid double count in middle)
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        System.out.println("Diagonal Sum = " + sum);
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        sum(matrix); // call function
    }
}

