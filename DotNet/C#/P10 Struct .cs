using System;

struct Books
{
    public string title;
    public string author;
    public string subject;
    public int book_id;
}

public class TestStructure
{
    public static void Main(string[] args)
    {
        Books Book1;
        Books Book2;

        /* Book1 specification */
        Book1.title = "C# Programming";
        Book1.author = "Nuha Ali";
        Book1.subject = "Dot net Tutorials";
        Book1.book_id = 6495407;

        /* Book2 specification */
        Book2.title = "Telecom Billing";
        Book2.author = "Zara Khan Ali";
        Book2.subject = "Nepal Telecom Tutorials";
        Book2.book_id = 6478407;

        // Print Book1 info with formatting
        Console.WriteLine("----------------------------------------");
        Console.WriteLine("|           Book 1 Details             |");
        Console.WriteLine("----------------------------------------");
        Console.WriteLine($"| {"Title",-10}: {Book1.title,-25} |");
        Console.WriteLine($"| {"Author",-10}: {Book1.author,-25} |");
        Console.WriteLine($"| {"Subject",-10}: {Book1.subject,-25} |");
        Console.WriteLine($"| {"Book ID",-10}: {Book1.book_id,-25} |");
        Console.WriteLine("---------------------------------------");

        // Print Book2 info with formatting
        Console.WriteLine("\n----------------------------------------");
        Console.WriteLine("|           Book 2 Details             |");
        Console.WriteLine("----------------------------------------");
        Console.WriteLine($"| {"Title",-10}: {Book2.title,-25} |");
        Console.WriteLine($"| {"Author",-10}: {Book2.author,-25} |");
        Console.WriteLine($"| {"Subject",-10}: {Book2.subject,-25} |");
        Console.WriteLine($"| {"Book ID",-10}: {Book2.book_id,-25} |");
        Console.WriteLine("----------------------------------------");

        Console.ReadKey();
    }
}