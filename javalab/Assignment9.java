// 1. Create a class “Vehicle” with a method “start()” that prints “Vehicle
// started”.Create a subclass “Car” that extends “Vehicle” and overrides the
// “start()” method to print “Car started”. Create an object of the “Vehicle” class
// and call the “start()” method.
// Create an object of the “Car” class and call the “start()” method.

public class Assignment9 {
    public static void main(String args[]){
Vehicle myvehical = new Vehicle();
myvehical.start();
Car mycar = new Car();
mycar.start();
    }
    static public class Vehicle{
       String vehiclename ;
       void start(){
        System.out.println("vehical started");
       }
    }
    static class Car extends Vehicle{
      
           @Override void start(){
                System.out.println("car started");
            
        }
    }
}
