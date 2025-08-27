import java.util.Scanner;

public class A_RaiseToThePower_B
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sn.nextInt();

        Scanner sp = new Scanner(System.in);
        System.out.print("Enter Power: ");
        int p = sp.nextInt();

         int pow = 1;
         for (int i=1; i<=p;i++)
         {
             pow *= n;
         }
        System.out.println(n+ " raised to the power "+p+" is "+pow);
    }
}
