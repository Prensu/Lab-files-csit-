public class TypeCasting
{
    public static void main(String[] args)
    {
        System.out.println("Type Casting:");
        int myInt=9;
        double myDouble=myInt;
        
        System.out.println(myInt);
        System.out.println(myDouble);
        
        System.out.println("narrowing Casting:");
        //Narrowing casting can be done by putting () paranthesis 
        
        double mydouble=8;
        int myint=(int) mydouble;
        System.out.println(myint);
        System.out.println(mydouble);
        
    }
}


