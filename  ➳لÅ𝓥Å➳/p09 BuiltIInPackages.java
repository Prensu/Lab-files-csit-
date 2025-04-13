import java.util.Scanner;

class BuiltInPackage
{
    public static void main(String[] args)
    {
        System.out.println("pAckages in Java:");
        Scanner obj=new Scanner(System.in); 
        System.out.println("Enter username:");

        String userName=obj.nextLine(); //nextline() reads complete line of input until user press enter 
        System.out.println("uSERNAME is :" +userName);
    }
}