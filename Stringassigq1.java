// Question 1 : Count how many times lowercase vowels occurred in a String entered by the
// user.


public class Stringassigq1 {
    // count vowel question
    public static int findVowel(String str){
        int count = 0;
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    if (ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
    }
}
return count;

    }
    public static void main(String args[]){
String str = "aeio u";
System.out.println(findVowel(str));


    }
}
