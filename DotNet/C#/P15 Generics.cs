using System;
using System.Collections.Generic;

namespace Tutlane
{
    class Program
    {
        static void Main(string[] args)
        {
            // Creating and initializing list
            List<int> list1 = new List<int>();
            list1.Add(1);
            list1.Add(8);
            list1.Add(45);

            List<string> list2 = new List<string>();
            list2.Add("Hi");
            list2.Add("Welcome");
            list2.Add("to");
            list2.Add("Tutlane");

            // Corrected Console.WriteLine statements
            Console.WriteLine("List1 Elements Count: " + list1.Count);
            Console.WriteLine("List1 Capacity: " + list1.Capacity); // Fixed incorrect reference

            Console.WriteLine("********** List1 Elements **********");

            // Accessing list elements
            foreach (var item in list1)
            {
                Console.WriteLine(item);
            }

            Console.WriteLine("\nList2 Elements Count: " + list2.Count);
            Console.WriteLine("List2 Capacity: " + list2.Capacity);

            Console.WriteLine("********** List2 Elements **********");

            foreach (var item in list2)
            {
                Console.WriteLine(item);
            }

            Console.ReadLine();
        }
    }
}
