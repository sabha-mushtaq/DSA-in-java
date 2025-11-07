public class oops {
    public static void main(String args[]){
pen p1 = new pen();
p1.setcolor("blue");
System.out.println(p1.color);
BankAccount b1 = new BankAccount();
b1.username = "sabha mushtaq";
System.out.println(b1.username);
b1.setpassword("tree");
System.out.println(b1.userpassword);
Student s1 = new Student("mushtaq");
Student s2 = new Student( s1);
System.out.println(s2.name);
    }


 static class pen {
String color;
int tip;
void setcolor(String newColor){
    color = newColor;
}
void settip(int x){
tip= x;

}

   }
}
class BankAccount{
 String username;
 String userpassword;
 void setpassword(String pwd){

    userpassword =pwd;
 }

}
class Student {
String name;
String section;
int marks[];
 Student(String name){
this.name=name;
System.out.println("Constructor has been called....");

 }
 // shallow copy constructor
Student(Student s1){
this.name=s1.name;
this.section =s1.section;
for(int i =0;i<marks.length;i++){
this.marks[i]=s1.marks[i];
}
 }

}