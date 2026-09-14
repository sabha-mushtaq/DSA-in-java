// reverse a string using a stack
import java.util.Stack;


/**
 * stack5
 */
public class stack5 {
    static Stack <Character> s1= new Stack<>();
        static int i=0;
public static String reversestring(String s){

    String reversedString = "";

    while(i!=s.length()){
        s1.push(s.charAt(i));
i++;
    }
    while (i!=0) {
       char value=s1.pop();
        reversedString+=value;
        i--;
    }
return reversedString;

}

    public static void main(String args[]){
String s1 = "orange";
System.out.print(reversestring(s1));


    }
}
