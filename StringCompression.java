public class StringCompression {
// function for string compression
public static StringBuilder Compress(StringBuilder str){
StringBuilder newStr = new StringBuilder("");
int count =1;
for(int i =0;i<str.length();i++){
   count =1;  
newStr.append(str.charAt(i));
while (i< str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
   count++;
   i++;

}
if (count>1) {
  
    newStr.append(count);
}

}
return newStr;

}


    public static void main(String args[]){

StringBuilder str = new StringBuilder("abc");
System.out.println(Compress(str));
    }
}
