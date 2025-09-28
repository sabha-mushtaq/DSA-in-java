public class spiralmatrix {
    // function to print spiral matrix
    public static void spiralprint(int matrix[][]) {
        int sr = 0;
        int er = matrix.length - 1;
        int sc = 0;
        int ec = matrix[0].length - 1;

        while (sc <= ec && sr <= er) {
            // top row
            for (int i = sc; i <= ec; i++) {
                System.out.print(matrix[sr][i] + " ");
            }

            // right column
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec] + " ");
            }

            // bottom row
            if (sr < er) {
                for (int i = ec - 1; i >= sc; i--) {
                    System.out.print(matrix[er][i] + " ");
                }
            }

            // left column
            if (sc < ec) {
                for (int i = er - 1; i > sr; i--) {
                    System.out.print(matrix[i][sc] + " ");
                }
            }

            sr++;
            er--;
            sc++;
            ec--;
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        spiralprint(matrix);
    }
}

