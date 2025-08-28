import java.util.Scanner;
//Do not use this method
// AP 2,5,8,11,... UPTO N
public class AP
/*{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth Term: ");
        int n = sc.nextInt();
        for (int i=2;i<=3*n-1; i+=3)
        {
            System.out.print(i+ " ");
        }
    }
}*/

//an = a + (n - 1)d
//an = 2 + (n - 1)3
//an = 2 + 3n - 2
//an = 3n - 1


//General Formula
{
    public static void main(String[] args)
    {
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter First Term: ");
        int a = sa.nextInt();

        Scanner sd = new Scanner(System.in);
        System.out.print("Enter Comman Difference: ");
        int d = sd.nextInt();

        Scanner sn = new Scanner(System.in);
        System.out.print("Enter nth Tearm: ");
        int n = sn.nextInt();

        for (int i = 1; i <= n; i++)
        {
            System.out.print(a+ " ");
            a+=d;
        }
    }
}
