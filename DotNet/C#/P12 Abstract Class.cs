using System;

abstract class Animal
{
    // Abstract method (must be implemented by derived classes)
    public abstract void MakeSound();

    // Regular method with implementation
    public void Sleep()
    {
        Console.WriteLine("Sleeping...");
    }
}

// Derived class that inherits from Animal
class Dog : Animal
{
    // Implementing the abstract method
    public override void MakeSound()
    {
        Console.WriteLine("Woof! Woof!");
    }
}

class Program
{
    static void Main()
    {
        Animal myDog = new Dog();  // Creating an object of Dog using Animal reference
        myDog.MakeSound();  // Output: Woof! Woof!
        myDog.Sleep();      // Output: Sleeping...
    }
}
