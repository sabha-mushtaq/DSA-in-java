public class Transpose {
    // Function to return transpose of a matrix
    public static int[][] trans(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] transposed = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Function to print a matrix
    public static void print(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int[][] var1 = { {4, 7, 8}, {8, 8, 7} };

        System.out.println("Original Matrix:");
        print(var1);

        System.out.println("Transposed Matrix:");
        int[][] result = trans(var1);
        print(result);   // ✅ use print() method
    }
}
