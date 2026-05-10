
// Write a Java program to create a class Calculator that accepts two numbers
// and an operator as input. Using objects, perform the required arithmetic
// operation, handle division by zero, and maintain the history of the last five
// calculations.

import javalab.Assignment8.Calculator;

public class Assignment8 {
    public static void main(String args[]) {
        Calculator c1 = new Calculator();

        c1.setN1(30);
        c1.setN2(0);
        c1.setOperator("+");
        System.out.println("Result: " + c1.calculate());

        c1.setOperator("/");
        c1.setN2(0); // division by zero
        System.out.println("Result: " + c1.calculate());

        c1.printhistory();
    }

    static class Calculator {
        int n1, n2;
        String operator;
       double result;
double[] history = new double[5];
int i=0;

void sethistory(double result){
  while(i<5){
    history[i]=result;
    i++;
  }
}
void printhistory(){
    for(int i=0;i<5;i++){
System.out.println(history[i]);

    }
}


        void setN1(int x) {
            n1 = x;
        }

        void setN2(int x) {
            n2 = x;
        }

        void setOperator(String op) {
            operator = op;
        }

        double calculate() {
            if (operator.equals("+")) {
                result = n1 + n2;
                return result;
            } 
            else if (operator.equals("-")) {
                result=n1 - n2;
                return result;
            } 
            else if (operator.equals("*")) {
                result =n1 * n2;
                return result;
            } 
            else if (operator.equals("/")) {
                if (n2 == 0) {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
                result= (double) n1 / n2;
                return result;
            } 
            else {
                System.out.println("Invalid operator");
                return 0;
            }
           
        }
         sethistory(result);
    }
}

