using System;
class ArrayTest{
    public static void Main()
    {
        //step1 :Array declaration
        string[] stringarr;
        
        //step2: String Initialization
        stringarr=new string[3]{"Element1","Element2","Element3"};
            
        //step3:Accessing array elements
        Console.WriteLine(stringarr[0]);
        Console.WriteLine(stringarr[1]);
        Console.WriteLine(stringarr[2]);
}
}