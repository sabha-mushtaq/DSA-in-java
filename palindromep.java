import java.util.*;
public class palindromep {

    // function to check if a String is a palindrome or not
    public static boolean isPalindrone(String name){
        int n = name.length();
for(int i=0;i<n/2;i++){
if (name.charAt(i)!=name.charAt(n-1-i)) {
    return false;
}
}
return true;
    }


    public static void main(String args[]){
String name = "sabha mushtaq";
System.out.println(name.charAt(0));
Scanner sc = new Scanner(System.in);
String enter = sc.nextLine();
System.out.println("your entered String :");
System.out.println(enter);
System.out.println(isPalindrone(enter));
    }
}
