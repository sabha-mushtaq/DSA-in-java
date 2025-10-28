import java.util.Arrays;

public class Anagrams {

    public static boolean isAnagram(String str1, String str2) {
        // Convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // If lengths differ, cannot be anagrams
        if (str1.length() != str2.length()) return false;

        // Convert to char arrays
        char[] Ch1 = str1.toCharArray();
        char[] Ch2 = str2.toCharArray();

        // Sort arrays
        Arrays.sort(Ch1);
        Arrays.sort(Ch2);

        // Compare contents
        return Arrays.equals(Ch1, Ch2);
    }

    public static void main(String args[]) {
        String str1 = "race";
        String str2 = "care";

        System.out.println(isAnagram(str1, str2)); // true
    }
}
