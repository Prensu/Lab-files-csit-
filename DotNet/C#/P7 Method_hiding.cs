using System;

class Animal
{
    // Base class method (not marked as virtual)
    public void MakeSound()
    {
        Console.WriteLine("Animal makes a sound");
    }
}

class Dog : Animal
{
    // Derived class method hides the base class method
    public new void MakeSound()
    {
        Console.WriteLine("Dog barks");
    }
}

class Cat : Animal
{
    // Derived class method hides the base class method
    public new void MakeSound()
    {
        Console.WriteLine("Cat meows");
    }
}

class Program
{
    static void Main()
    {
        Animal myAnimal = new Animal(); // Base class object
        Animal myDog = new Dog();       // Derived class object (treated as Animal)
        Dog myRealDog = new Dog();      // Derived class object (treated as Dog)
        Cat myCat = new Cat();          // Derived class object (treated as Cat)

        myAnimal.MakeSound(); // Output: Animal makes a sound
        myDog.MakeSound();    // Output: Animal makes a sound (base class method is called)
        myRealDog.MakeSound(); // Output: Dog barks (derived class method is called)
        myCat.MakeSound();    // Output: Cat meows (derived class method is called)
    }
}