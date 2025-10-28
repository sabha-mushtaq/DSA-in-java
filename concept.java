public class concept {
    public static void main(String args[]){
   // true
 String s1 = new String("Hello"); // heap object
        String s2 = "Hello";             // pool object

        System.out.println("s1 hashCode: " + System.identityHashCode(s1)); // heap
        System.out.println("s2 hashCode: " + System.identityHashCode(s2)); // pool

        String s3 = s1.intern(); // reference from string pool
        System.out.println("s3 hashCode: " + System.identityHashCode(s3)); // same as s2

        // Verify
        System.out.println(s2 == s3); 

    }
}
