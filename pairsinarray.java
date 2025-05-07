public class PairsInArray {

    public static void pairArray(int numb[]) {
        int tpp = 0;  // total pair count
        for (int i = 0; i < numb.length; i++) {
            int curr = numb[i];
            for (int j = i + 1; j < numb.length; j++) {
                System.out.println("(" + curr + ", " + numb[j] + ")");
                tpp++;
            }
        }
        System.out.println("Total pairs are: " + tpp);
    }

    public static void main(String args[]) {
        int numb[] = {1, 2};
        pairArray(numb);
    }
}
