using System;

class Program{
    enum DaysOfWeek{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }

    static void Main(string[] args)
    {
        DaysOfWeek today=DaysOfWeek.Sunday;
        DaysOfWeek yesterday=DaysOfWeek.Saturday;
        Console.WriteLine("Today is {0}",today);
        Console.WriteLine("Yesterday is "+yesterday);

        Console.WriteLine("The numeric value of today is: "+(int)today);
        
        Console.ReadKey();
    }
}
