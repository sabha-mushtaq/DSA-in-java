// Define the Animal class
class Animal {
    String color;
    void eats() {
        System.out.println("animal eats");
    }
}

// Define the Fish class, extending Animal
class Fish extends Animal {
    void name(String name) {
        System.out.println("my name is " + name);
    }
}

// Main class to run the program
public class exam {
    public static void main(String[] args) {
        // Create an instance of the Fish class
        Fish myFish = new Fish();

        // Call methods on the Fish object
        myFish.eats(); // Inherited method from Animal
        myFish.name("Wanda"); // Method defined in Fish class
    }
}


