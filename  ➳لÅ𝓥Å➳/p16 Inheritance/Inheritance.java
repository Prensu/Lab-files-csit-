// Parent class
class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method in parent class
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Call parent class constructor
    }
a
    // Additional method in child class
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class to test inheritance
public class Main {
    public static void main(String[] args) {
        // Create an instance of the child class
        Dog dog = new Dog("Chihuahua");

        // Call methods from both parent and child classes
        dog.eat();  // Inherited from Animal
        dog.bark(); // Defined in Dog
    }
}