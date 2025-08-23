import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X Number: ");
        int x = sc.nextInt();
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter Y Number: ");
        int y = sa.nextInt();
        Scanner si = new Scanner(System.in);
        System.out.print("Enter Z Number: ");
        int z = si.nextInt();
        if (x>y && x>z)
        {
            System.out.println("X is greater then Y and Z");
        }
        else if (y>z && y>x)
        {
            System.out.println("Y is greater then X and Z");
        }
        else if (z>x && z>y)
        {
        System.out.println("Y is greater then X and Z");
        }
        else
        {
            System.out.println("All are same");
        }
    }
}
