import java.util.Scanner;
public class ThreePositiveIntegersAsInputAndPrintTheSmallestOne
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int s;
        if (a <= b && a <= c)
        {
            s = a;
        }
        else if (b <= a && b <= c)
        {
            s = b;
        }
        else
        {
            s = c;
        }
        System.out.println("The smallest number is: " + s);
    }
}
