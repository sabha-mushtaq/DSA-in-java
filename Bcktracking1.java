// print all possible combinations of a given string
public class Bcktracking1 {
    public static void print(String str,String prem){
//base case for it is that if length of string becomes "" thst is zero print the permutation
if(str.length()==0){
    System.out.println(prem);
return;
}
for(int i=0;i<str.length();i++){
char currstr=str.charAt(i);
String newstr =str.substring(0,i)+str.substring(i+1);
print(newstr,prem+currstr);
}
    }
    public static void main(String[] args){
String str ="ABC";
print(str, "");
    }
}
