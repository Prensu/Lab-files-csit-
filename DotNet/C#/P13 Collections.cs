using System;
using System.Collections;

class Program{
    static void Main(string[] args)
    {
        ArrayList al=new ArrayList();
        Console.WriteLine("Adding some numbers:");
        al.Add(45);
        al.Add(33);
        al.Add(12);
        al.Add(13);
        al.Add(14);
        Console.WriteLine("Capacity:{0}",al.Capacity);
        Console.WriteLine("Count:{0}",al.Count);
        Console.Write("Content: ");
        foreach(int i in al)
        {
            Console.Write(i+"");
            Console.WriteLine();
            al.Sort();
            foreach (int i in al)
            {
                Console.WriteLine(i+"");
            }
            Console.WriteLine();
            Console.ReadKey();
        }
    }
}