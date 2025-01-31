using System;

class Animal
{
    // Base class method marked as virtual
    public virtual void MakeSound()
    {
        Console.WriteLine("Animal makes a sound");
    }
}

class Dog : Animal
{
    // Derived class method overrides the base class method
    public override void MakeSound()
    {
        Console.WriteLine("Dog barks");
    }
}

class Cat : Animal
{
    // Derived class method overrides the base class method
    public override void MakeSound()
    {
        Console.WriteLine("Cat meows");
    }
}

class Program
{
    static void Main()
    {
        Animal myAnimal = new Animal(); // Base class object
        Animal myDog = new Dog();       // Derived class object (Dog)
        Animal myCat = new Cat();       // Derived class object (Cat)

        myAnimal.MakeSound(); // Output: Animal makes a sound
        myDog.MakeSound();    // Output: Dog barks
        myCat.MakeSound();    // Output: Cat meows
    }
}
