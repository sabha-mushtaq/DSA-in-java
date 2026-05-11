// 2. Create a class “Person” with fields “name” and “age” and a method
// “display()” that prints the name and age of the person. Create a subclass
// “Employee” that extends “Person” and adds a field “salary” and a method
// “display()” that prints the name, age, and salary of the employee.
// Create an object of the “Person” class and call the “display()” method. Create
// an object of the `Employee` class and call the “display()” method.
public class Assignment10 {

    public static void main(String args[]) {

      
        Person p1 = new Person("sabha", 15);
        p1.display();

        System.out.println();

       
        Employee e1 = new Employee("hadiya", 25, 50000);
        e1.display();
    }

  
    static class Person {

        String name;
        int age;

    
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }


    static class Employee extends Person {

        int salary;

   
        Employee(String name, int age, int salary) {
            super(name, age); 
            this.salary = salary;
        }

       
        @Override
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }
}