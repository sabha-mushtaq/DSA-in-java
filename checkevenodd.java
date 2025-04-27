// Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
// method.
public class checkevenodd {
    static  boolean check(int a){
if (a%2 ==0) {
    return true;
}

return false;


    }
    public static void main(String args[]){
        System.out.println(check(3));



    }
}
