import java.util.Scanner;

public class CountDigitsOfANumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if (n == 0) n = 9;
        int count = 0;
        while (n != 0)
        {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
