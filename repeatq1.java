// Question 1: Given an integer array nums, return true if any value appears at least twice in the
// array, and return false if every element is distinct.
// Example 1:
// Input: Output: true
// Example 2:
// Input: Output: false
// Example 3:
// Input: Output: true
// nums = [1, 2, 3, 1]
// nums = [1, 2, 3, 4]
// nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
// Constraints:
// • 1 <= nums . lengtth <= 105
// • -109 <= nums [ i ] <= 109
public class repeatq1{
public static boolean repeat(int [] numb){

for (int i = 0; i< numb.length; i++) {
    for (int j = i+1; j < numb.length; j++) {
        if (numb[i]==numb[j]) {
            return true;
        }
    }
}
return false;
}

public static void main(String args[]){
int [] numbs ={1,2,3,4,2,32,34,42};
int [] arr2 ={1,2,3,4,5,6,7};
System.out.println(repeat(arr2));

}




}