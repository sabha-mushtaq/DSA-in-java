import java.util.*;
public class  bill{
    public static void main (String args[]){
Scanner price = new Scanner(System.in);
System.out.println("Enetr the cost of pencil : ");
float pencil = price.nextFloat();
System.out.println("Enetr the cost of pen : ");
float pen = price.nextFloat();
System.out.println("Enetr the cost of eraser : ");
float eraser = price.nextFloat();
float bill = (pencil + pen + eraser) +(( 18/100)*(pencil + pen + eraser));
System.out.print("your total bill is :");
System.out.print(bill);
    }
}
