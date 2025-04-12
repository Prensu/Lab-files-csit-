public class App
{
    public static void main(String[] args)
    {
        int mynum=15;
        mynum=20;
        System.out.println(mynum);
        System.out.println(3*15);
        
        //final means you don't want others to override the value
        final int myNum=10;
        myNum=22;
        System.out.println(myNum);
        
        float myFloatNum=5.99f;
        //the f is very important because bydefault the compiler treats it as  a double so you need to treat it as a float 
        char myLetter='F';
        boolean myBool=true;
        string myText="Hello";
    }
}


