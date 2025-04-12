public class Javamethods
{
    public static void myMethod(String fname)
    {
        System.out.println(fname+"dangol");
    }
    
    public static int mymethod(int x)
    {
        return x+6;
    }
    public static void main(String[] args)
    {
    myMethod("Prensu ");
    myMethod("Prince ");
    myMethod("Princess ");
    //using return type method also
    System.out.println(mymethod(55));
    
    }
    
}
