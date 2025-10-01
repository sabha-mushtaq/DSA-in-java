// for agiven string convert each the first letter of each word to uppercase

public class stringq1 {
    public static String toUpperCaseEachWord(String strr) {
        StringBuilder str = new StringBuilder();

        // Capitalize the first character
        str.append(Character.toUpperCase(strr.charAt(0)));

        for (int i = 1; i < strr.length(); i++) {
            // If space found and next char exists → capitalize it
            if (strr.charAt(i - 1) == ' ' && i < strr.length()) {
                str.append(Character.toUpperCase(strr.charAt(i)));
            } else {
                str.append(strr.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String args[]) {
        String result = toUpperCaseEachWord("my name is sabha");
        System.out.println(result); // Output: My Name Is Sabha
    }
}
