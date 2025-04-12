public class Learningarrays
 {
    public static void main(String[] args)
    {
        String[] arrInJava={"vipraj","nigam","silent","killer"};
        int[] myNum={1,2,5,6,9};
        System.out.println(arrInJava[0]);
        System.out.println(myNum[3]);
        System.out.println("Changing an array element... ");
        arrInJava[0]="Sonu";
        myNum[3]=22;
        System.out.println(arrInJava[0]);
        System.out.println(myNum[3]);
        System.out.println("Looping through array elements... ");
        String[] cars={"volvo","BMW","Ford","Mustang"};
        for(int i=0;i<cars.length;i++)
        {
            System.out.println(cars[i]);
        }
    }
}
