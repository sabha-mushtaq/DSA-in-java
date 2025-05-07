// linear search
public class LinearSearch {

    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = linearsearch(numbers, 7);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("NOT FOUND");
        }
    }
}


