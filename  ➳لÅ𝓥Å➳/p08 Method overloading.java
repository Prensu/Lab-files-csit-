public class Javamethods
{
   static int plusMethod(int x, int y)
   {
       return x+y;
       
   }
   
   static double plusMethod(double x, double y)
   {
       return x+y;
       
   }
   
   public static void main(String[] args)
   {
       int myInt=plusMethod(5,8);
       double myDouble=plusMethod(5.22,9.88);
       System.out.println(myInt);
       System.out.println(myDouble);
   }
    
}
