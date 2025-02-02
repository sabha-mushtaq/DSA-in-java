import java.util.Scanner;

public class incometaxcalculator {
    public static void main(String args[]){

System.out.println("Enter your salary : ");
Scanner salary = new Scanner(System.in);
int sal = salary.nextInt();
if (sal< 500000) {
    System.out.println("tax on your salary is 0");

}
else if(sal>500000 && sal <1000000){
    int tax1 = (20 * sal) / 100; 
System.out.println("tax on your salary is "+ tax1);


}

 else {
    int tax2 = (30 * sal) / 100; 
    System.out.println("tax on your salary is " + tax2);
}

    }
}
