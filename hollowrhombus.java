public class hollowrhombus {

    public static void hollowrhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // print hollow rectangle-like stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollowrhombus(5);
    }
}
