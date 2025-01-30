using System;
public class MyClass
{ 
    //private field to store the value
    private int myValue;

    //Default Constructor
    public MyClass(){
        myValue=0;
        Console.WriteLine("Default Constructor called");
    }

    //parameterized constructor
    public MyClass(int value){
        myValue=value;
        Console.WriteLine("Parameterized constructor called!");
    }

    //method to display the value
    public void DisplayValue()
    {
        Console.WriteLine("The value is "+myValue);
    }
}

public class Program{
    public static void Main(string[] args)
    {
        MyClass obj1=new MyClass();
        obj1.DisplayValue();

        MyClass obj2=new MyClass(10);
        obj2.DisplayValue();
    }
}